package org.example.service;

import org.springframework.web.reactive.function.client.WebClient;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ExternalReactiveService {
    @Bulkhead(name = "serviceBulkhead", type = Bulkhead.Type.THREADPOOL)
    public Mono<String> fetchData() {
        return WebClient.create().get().uri("https://example.com").retrieve().bodyToMono(String.class);
    }
}