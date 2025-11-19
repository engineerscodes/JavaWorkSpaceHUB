package org.example.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.PersonDTO;
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

    @Autowired
    private ObjectMapper objectMapper;



    @GetMapping("/batch")
    public ResponseEntity<Object> signUp() throws Exception {
        // Hardcoded PersonDTO values
        PersonDTO personDTO = new PersonDTO("John Doe", 30);
        
        // Serialize PersonDTO to JSON string
        String personJson = objectMapper.writeValueAsString(personDTO);
        
        JobParameters params = new JobParametersBuilder()
                .addLocalDateTime("date", java.time.LocalDateTime.now())
                .addString("name", personDTO.getName())
                .addString("person", personJson)
                .toJobParameters();
        jobLauncher.run(demoJob, params);
        log.info("===============================");
        log.info("Batch job started with name: {} and age: {}", personDTO.getName(), personDTO.getAge());
        return ResponseEntity.ok("Batch job started for " + personDTO.getName());
    }


}
