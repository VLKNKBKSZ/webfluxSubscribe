//package com.element.webflux.services;
//
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Flux;
//
//import java.time.LocalTime;
//
//@Slf4j
//public class EventSubscriber {
//
//    private Logger LOG = LoggerFactory.getLogger(EventSubscriber.class);
//
//    public void consumeServerSentEvent() {
//        WebClient webClient = WebClient.create("http://localhost:8080/");
//        ParameterizedTypeReference<String> type = new ParameterizedTypeReference<String>() {};
//
//        Flux<String> eventStream = webClient
//                .get()
//                .uri("/events")
//                .retrieve()
//                .bodyToFlux(type);
//
//        eventStream.subscribe(
//
//                        content -> LOG.info("Time: {} - event: name[{}], id [{}], content[{}] ",
//                                LocalTime.now(), content.toString()),
//                        error -> LOG.error("Error receiving SSE: {}", error),
//                        () -> LOG.info("Completed!!!"));
//
//    }
//}
