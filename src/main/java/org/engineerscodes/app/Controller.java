package org.engineerscodes.app;

import lombok.extern.slf4j.Slf4j;
import org.engineerscodes.app.jpa.millions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@RestController
@RequestMapping("DryTest")
@Slf4j
public class Controller {

    @Autowired
    MillionsService millionsService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<millions> get(){
       log.info("START");
       return millionsService.processStreaming().take(1_000_000).publishOn(Schedulers.parallel())
               .onBackpressureBuffer()
               .doOnComplete(()->log.info("OVER"));
    }

}
