package com.element.webflux.config;

import com.element.webflux.services.RequestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.http.MediaType.TEXT_EVENT_STREAM;

@Configuration
/**
 * Server side setting the endpoint.
 */
public class RequestRouter {

    @Bean
    RouterFunction<?> routes(RequestHandler requestHandler) {
        return RouterFunctions
                .route(RequestPredicates
                                .GET("/weatherstream")
                                .and(RequestPredicates.accept(TEXT_EVENT_STREAM)),
                        requestHandler::streamWeather);
    }

}
