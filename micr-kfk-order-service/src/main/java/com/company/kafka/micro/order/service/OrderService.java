package com.company.kafka.micro.order.service;

import java.util.List;

import com.company.kafka.micro.order.model.OrderDetailsDto;

public interface OrderService {
	public List<OrderDetailsDto> getAllOrderList();
	public OrderDetailsDto getOrderById(String id);
	public OrderDetailsDto createOrder(OrderDetailsDto order);
	public boolean updateOrder(Long id, OrderDetailsDto orderDetails);
}
