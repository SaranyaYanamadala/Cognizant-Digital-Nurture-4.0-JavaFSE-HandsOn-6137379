package com.cognizant.order_service.dto;

import com.cognizant.order_service.entity.Order;

public class OrderResponse {

	private Order order;
	private User user;
	
	public OrderResponse(Order order, User user) {
		super();
		this.order = order;
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderResponse [order=" + order + ", user=" + user + "]";
	}
	
}
