package org.example.component;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class TimeoutListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job is starting...");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job has ended.");
    }
}