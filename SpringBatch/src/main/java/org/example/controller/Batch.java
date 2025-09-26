package org.example.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class Batch {


    @Autowired
    private JobLauncher jobLauncher;


    @Autowired
    private Job demoJob;



    @GetMapping("/batch")
    private ResponseEntity<Object> signUp() throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
        JobParameters params = new JobParametersBuilder()
                .addLocalDateTime("date", java.time.LocalDateTime.now())
                .toJobParameters();
        jobLauncher.run(demoJob, params);
        log.info("===============================");
        return ResponseEntity.ok("Hello World");
    }


}
