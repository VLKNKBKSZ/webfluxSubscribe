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

    //Use the builder to get more ustomization options including filters, default headers, cookies, client-connectors.

    /*@Bean
    WebClient webClientBuilder() {
        return WebClient.builder().baseUrl().defaultHeader().filter().build()
    }*/

    // This can be activated to subsribe to the endpoint. Outcommented cuz its in the same module
    /*@Bean
    ApplicationRunner runner(WebClient webClient) {

        return args -> webClient.get()
                .uri("weatherstream")
                // .header("Authorization", "Basic " + Base64Utils
                // .encodeToString((username + ":" + token).getBytes(UTF_8)))
                // .exchange(

                //filter(ExchangeFilterFunctions
                //.basicAuthentication(username, token))
                .retrieve()
                .bodyToFlux(WeatherEvent.class)
                .subscribe(data -> LOG.info(data.toString()));
    }*/

    // info: https://www.callicoder.com/spring-5-reactive-webclient-webtestclient-examples/
}
