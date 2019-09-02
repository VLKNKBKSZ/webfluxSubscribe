package com.element.webflux.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
/**
 * Configuration for the beans that the application requires.
 */
public class EventWebClient {

    private Logger LOG = LoggerFactory.getLogger(EventWebClient.class);

    @Bean
    WebClient client() {
        return WebClient.create("http://localhost:8080/");
    }

    // This can be activated to subsribe to the endpoint. Outcommented cuz its in the same module
    /*@Bean
    ApplicationRunner runner(WebClient webClient) {

        return args -> webClient.get()
                .uri("weatherstream")
                .retrieve()
                .bodyToFlux(WeatherEvent.class)
                .subscribe(data -> LOG.info(data.toString()));
    }*/
}
