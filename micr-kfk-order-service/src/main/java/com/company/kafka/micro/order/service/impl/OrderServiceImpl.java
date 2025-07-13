package com.company.kafka.micro.order.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.kafka.micro.order.model.OrderDetailsDto;
import com.company.kafka.micro.order.repository.impl.OrderDetailsRepoImpl;
import com.company.kafka.micro.order.service.OrderService;

import jakarta.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

	private final OrderDetailsRepoImpl orderDetailsRepoImpl; 
	
	public OrderServiceImpl(OrderDetailsRepoImpl orderDetailsRepoImpl) {
		this.orderDetailsRepoImpl = orderDetailsRepoImpl;
	}
	
	@Override
	public List<OrderDetailsDto> getAllOrderList() {
		List<OrderDetailsDto> orderList = this.orderDetailsRepoImpl.getAllOrderList();
		return orderList;
	}

	@Override
	public OrderDetailsDto getOrderById(String orderId) {
		OrderDetailsDto orderDetails = this.orderDetailsRepoImpl.getOrderById(orderId);
		return orderDetails;
	}

	@Override
	@Transactional
	public OrderDetailsDto createOrder(OrderDetailsDto order) {
		OrderDetailsDto orderDetails = this.orderDetailsRepoImpl.createOrder(order);
		return orderDetails;
	}

	@Override
	public boolean updateOrder(Long id, OrderDetailsDto orderDetails) {
		return true;
	}

}
