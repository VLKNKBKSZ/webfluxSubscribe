package com.element.webflux.config;

import com.element.webflux.domain.WeatherEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.client.WebClient;
//
//@Configuration
//public class EventWebClient {
//
//    private Logger LOG = LoggerFactory.getLogger(EventWebClient.class);
//
//    @Bean
//    WebClient client() {
//        return WebClient.create("http://localhost:8080/");
//    }
//
//    @Bean
//    ApplicationRunner runner(WebClient webClient) {
//
//        return args -> webClient.get()
//                .uri("weatherstream")
//                .retrieve()
//                .bodyToFlux(WeatherEvent.class)
//                .subscribe(data -> LOG.info(data.toString()));
//    }
//}
