package com.cognizant.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;


@Component
@Order(1)
public class LogFilter implements GlobalFilter {

	private static final Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("====> Incoming Request URL: {}", exchange.getRequest().getURI());
		return chain.filter(exchange);
	}
}
