package com.cognizant.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.cognizant.order_service.dto.OrderResponse;
import com.cognizant.order_service.dto.User;
import com.cognizant.order_service.entity.Order;
import com.cognizant.order_service.repository.OrderRepository;

import reactor.core.publisher.Mono;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<OrderResponse> createOrder(Order order) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8081/users/" + order.getUserId())
                .retrieve()
                .bodyToMono(User.class)
                .flatMap(user -> {
                    Order savedOrder = orderRepo.save(order);
                    return new OrderResponse(savedOrder, user);
                });
    }
}
