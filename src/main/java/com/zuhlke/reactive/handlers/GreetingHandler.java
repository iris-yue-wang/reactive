package com.zuhlke.reactive.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
    private static final Logger logger = LoggerFactory.getLogger(GreetingHandler.class);

    public Mono<ServerResponse> hello(ServerRequest request) {
        logger.info("Getting greeting.");
        return ServerResponse.ok().body(BodyInserters.fromObject("Hello, Spring!"));
    }
}
