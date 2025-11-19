package org.example.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

@Service
public class ExternalReactiveService {

    private static final Logger log = LoggerFactory.getLogger(ExternalReactiveService.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Bulkhead(name = "serviceBulkhead", type = Bulkhead.Type.SEMAPHORE)
    public Mono<String> fetchData() {
        return WebClient.create().get().uri("https://api.github.com/zen")
                .retrieve()
                .bodyToMono(String.class)
                .doOnError(WebClientResponseException.class, ex -> 
                        log.error("Error fetching data from GitHub API - Status Code: {}, Message: {}", 
                                ex.getStatusCode().value(), ex.getMessage()))
                .retryWhen(Retry.fixedDelay(5, Duration.ofMinutes(5))
                        .filter(throwable -> throwable instanceof WebClientResponseException &&
                                (((WebClientResponseException) throwable).getStatusCode().value() == 504 ||
                                        ((WebClientResponseException) throwable).getStatusCode().value() == 503))
                        .doBeforeRetry(retrySignal -> 
                                log.warn("Retrying GitHub API call - Attempt: {}, Error: {}", 
                                        retrySignal.totalRetries() + 1, retrySignal.failure().getMessage())));
    }

    @Bulkhead(name = "serviceBulkhead", type = Bulkhead.Type.SEMAPHORE)
    public Mono<String> fetchDataPageFromPath(String path, int page, int size) {
        return WebClient.create()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("http")
                        .host("localhost")
                        .port(9000)
                        .path(path)
                        .queryParam("page", page)
                        .queryParam("size", size)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .doOnError(WebClientResponseException.class, ex -> 
                        log.error("Error fetching page {} from {} - Status Code: {}, Message: {}", 
                                page, path, ex.getStatusCode().value(), ex.getMessage()))
                .retryWhen(Retry.fixedDelay(5, Duration.ofMinutes(1))
                        .filter(throwable -> throwable instanceof WebClientResponseException &&
                                (((WebClientResponseException) throwable).getStatusCode().value() == 504 ||
                                        ((WebClientResponseException) throwable).getStatusCode().value() == 503))
                        .doBeforeRetry(retrySignal -> 
                                log.warn("Retrying API call for page {} from {} - Attempt: {}, Error: {}", 
                                        page, path, retrySignal.totalRetries() + 1, retrySignal.failure().getMessage())));
    }

    public Flux<String> fetchAllDataFromPath(String path, int size) {
        return fetchDataPageFromPath(path, 0, size).flatMapMany(firstPage -> {
            try {
                JsonNode root = objectMapper.readTree(firstPage);
                int totalPages = root.path("totalPages").asInt();
                log.info("Fetched page 0/{} from {}, response: {}", totalPages - 1, path, firstPage);

                if (totalPages <= 1) {
                    return Flux.just(firstPage);
                }

                return Flux.concat(
                        Mono.just(firstPage),
                        Flux.range(1, totalPages)
                                .concatMap(page -> fetchDataPageFromPath(path, page, size)
                                        .doOnNext(response -> log.info("Fetched page {}/{} from {}, response: {}", page, totalPages, path, response)))
                );
            } catch (Exception e) {
                return Flux.error(e);
            }
        });
    }
}