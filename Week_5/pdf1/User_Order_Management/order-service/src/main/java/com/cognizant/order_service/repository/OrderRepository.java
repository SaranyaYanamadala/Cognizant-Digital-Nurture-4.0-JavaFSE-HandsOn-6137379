package com.cognizant.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.order_service.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
