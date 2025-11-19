package org.example.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.resilience4j.bulkhead.BulkheadConfig;
import io.github.resilience4j.bulkhead.ThreadPoolBulkheadConfig;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import lombok.Data;
import org.example.component.TimeoutListener;
import org.example.dto.PersonDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.core.job.builder.*;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.*;
import org.springframework.batch.core.repository.ExecutionContextSerializer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.dao.Jackson2ExecutionContextStringSerializer;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.core.step.builder.*;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4jBulkheadProvider;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4jBulkheadProvider;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;
import java.io.Serializable;
import java.time.Duration;
import java.util.Objects;

@Configuration
@EnableBatchProcessing(executionContextSerializerRef = "jacksonSerializer")
@EnableTransactionManagement
public class BatchConfig {


    private static final Logger log = LoggerFactory.getLogger(BatchConfig.class);

    @Bean
    public Job demoJob(JobRepository jobRepository, Step demoStep, Step step1, Step step2, Step step3) {
        // Create a flow for step1 followed by step3
        Flow flow1 = new FlowBuilder<Flow>("flow1")
                .start(step1)
                .next(step3)
                .build();
        
        // Create a flow for step2 (runs in parallel with flow1)
        Flow flow2 = new FlowBuilder<Flow>("flow2")
                .start(step2)
                .build();
        
        // Create a split that runs flow1 and flow2 in parallel
        Flow parallelFlow = new FlowBuilder<Flow>("parallelFlow")
                .split(new SimpleAsyncTaskExecutor())
                .add(flow1, flow2)
                .build();
        
        return new JobBuilder("demoJob", jobRepository)
                .listener(new TimeoutListener())
                .start(demoStep)
                .on("COMPLETED").to(parallelFlow)
                .end()
                .build();
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public Step demoStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("demoStep", jobRepository)
                .tasklet((contribution, chunkContext) -> {
                    StepExecution stepExecution = chunkContext.getStepContext().getStepExecution();
                    JobExecution jobExecution = stepExecution.getJobExecution();
                    
                    // Get job parameter person as JSON string
                    String personJson = jobExecution.getJobParameters().getString("person");
                    log.info("Person JSON: {}", personJson);
                    
                    // Deserialize JSON to PersonDTO object
                    PersonDTO personDTO = objectMapper.readValue(personJson, PersonDTO.class);
                    log.info("Person DTO - Name: {}, Age: {}", personDTO.getName(), personDTO.getAge());
                    
                    ExecutionContext jobContext = jobExecution.getExecutionContext();

                    jobContext.putString("Data", new MyCustomData("LOLLLLL<>" + jobExecution.getId() + ".txt").toString());

                    String earlyData = jobContext.getString("Data");
                    log.info("Early Data from Job Execution Context: {}", earlyData);
                    System.out.println(">>> Running batch job with REST trigger <<<");
                    return RepeatStatus.FINISHED;
                }, transactionManager).allowStartIfComplete(true)
                .build();
    }

    @Bean
    public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager, org.example.service.ExternalReactiveService externalReactiveService) {
        return new StepBuilder("step1", jobRepository)
                .tasklet((contribution, chunkContext) -> {
                    log.info("Step 1: Fetching data from external source...");
                    String result = externalReactiveService.fetchData().block();
                    log.info("Step 1 Result: {}", result);
                    return RepeatStatus.FINISHED;
                }, transactionManager)
                .build();
    }

    @Bean
    public Step step2(JobRepository jobRepository, PlatformTransactionManager transactionManager, org.example.service.ExternalReactiveService externalReactiveService) {
        return new StepBuilder("step2", jobRepository)
                .tasklet((contribution, chunkContext) -> {
                    int page = 0;
                    int size = 100;
                    log.info("Step 2: Fetching data batch - Page: {}, Size: {}", page, size);
                    String result = Objects.requireNonNull(externalReactiveService.fetchAllDataFromPath("/api/data/v1", size).collectList().block()).toString();
                    log.info("Step 2 Result: {}", result);
                    return RepeatStatus.FINISHED;
                }, transactionManager)
                .build();
    }

    @Bean
    public Step step3(JobRepository jobRepository, PlatformTransactionManager transactionManager, org.example.service.ExternalReactiveService externalReactiveService) {
        return new StepBuilder("step3", jobRepository)
                .tasklet((contribution, chunkContext) -> {
                    int page = 1;
                    int size = 500;
                    log.info("Step 3: Fetching data batch - Page: {}, Size: {}", page, size);
                    String result = Objects.requireNonNull(externalReactiveService.fetchAllDataFromPath("/api/data/v2", size).collectList().block()).toString();
                    log.info("Step 3 Result: {}", result);
                    return RepeatStatus.FINISHED;
                }, transactionManager)
                .build();
    }

    @Bean
    public JobRepository jobRepository(DataSource dataSource, PlatformTransactionManager transactionManager) throws Exception {
        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTransactionManager(transactionManager);
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    @Bean
    public JobLauncher jobLauncher(JobRepository jobRepository) throws Exception {
        TaskExecutorJobLauncher jobLauncher = new TaskExecutorJobLauncher();
        jobLauncher.setJobRepository(jobRepository);

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(2);
        executor.setThreadNamePrefix("batch-job-");
        executor.initialize();

        jobLauncher.setTaskExecutor(executor);
        jobLauncher.afterPropertiesSet();
        return jobLauncher;
    }

    @Bean
    public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizer() {
        return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
                .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(4)).build())
                .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
                .build());
    }

    @Bean
    public Customizer<ReactiveResilience4jBulkheadProvider> reactiveSpecificBulkheadCustomizer() {
        return provider -> provider.configure(builder -> {
            builder.bulkheadConfig(BulkheadConfig.custom()
                    .maxConcurrentCalls(2)
                    .build());
        }, "serviceBulkhead");
    }


    @Bean
    public ExecutionContextSerializer jacksonSerializer() {
        return new Jackson2ExecutionContextStringSerializer();
    }

}
