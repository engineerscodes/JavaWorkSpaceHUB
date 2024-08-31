package org.engineerscodes.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import static java.lang.StringTemplate.STR;

@SpringBootApplication
@Slf4j
@Transactional
public final class Main {

    private final MillionsService millionsService;

    public Main(MillionsService millionsService) {
        this.millionsService = millionsService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Bean
    @Transactional(readOnly = true)
    public ApplicationRunner initializer() {
        return args -> {
            log.info("START : {} ,MAX {}",Runtime.getRuntime().freeMemory(),Runtime.getRuntime().maxMemory());
            millionsService.processStreaming();
            log.info("END");
        };
    }
}