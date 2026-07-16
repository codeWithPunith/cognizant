package com.example.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Component
public class LogFilter implements GlobalFilter, Ordered {

    private static final Logger log = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
        String method = exchange.getRequest().getMethodValue();
        String uri = exchange.getRequest().getURI().toString();
        String timestamp = Instant.now().toString();
        log.info("[Request] {} {} @ {}", method, uri, timestamp);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
