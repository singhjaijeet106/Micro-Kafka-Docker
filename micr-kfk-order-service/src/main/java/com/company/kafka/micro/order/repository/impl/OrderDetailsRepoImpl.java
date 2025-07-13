package com.company.kafka.micro.order.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.company.kafka.micro.order.model.ItemDetailDto;
import com.company.kafka.micro.order.model.OrderDetailsDto;
import com.company.kafka.micro.order.repository.OrderDetailsRepository;
import com.company.kafka.micro.order.repository.entity.OrderDetails;
import com.company.kafka.micro.order.util.OrderServiceUtil;

@Repository
public class OrderDetailsRepoImpl {
	private final OrderDetailsRepository orderDetailsRepository;
	private final ItemDetailRepoImpl itemDetailRepoImpl;

	public OrderDetailsRepoImpl(OrderDetailsRepository orderDetailsRepository,ItemDetailRepoImpl itemDetailRepoImpl) {
		this.orderDetailsRepository = orderDetailsRepository;
		this.itemDetailRepoImpl = itemDetailRepoImpl;
	}
	
	public List<OrderDetailsDto> getAllOrderList() {
		List<OrderDetailsDto> orderList = new ArrayList<>();
		
		List<OrderDetails> orderDetailList = this.orderDetailsRepository.findAll();
		for (OrderDetails orderDetails : orderDetailList) {
			orderList.add(OrderServiceUtil.convertToOrderDetailsDto(orderDetails));
		}
		
		return orderList;
	}
	
	public OrderDetailsDto getOrderById(String orderId) {
		Optional<OrderDetails> orderDetails = this.orderDetailsRepository.findByOrderId(orderId);
		if(orderDetails.isPresent()) {
			OrderDetailsDto orderDetailsDto = OrderServiceUtil.convertToOrderDetailsDto(orderDetails.get());
			List<ItemDetailDto> itemDetailsList = itemDetailRepoImpl.getAllListByOrderId(orderId);
			orderDetailsDto.setItemDetails(itemDetailsList);
			return orderDetailsDto;
		}
		return null;
	}
	
	public OrderDetailsDto createOrder(OrderDetailsDto order) {
		this.itemDetailRepoImpl.saveItemsToOrder(order.getItemDetails());
		OrderDetails orderDetails = OrderServiceUtil.convertToOrderDetails(order);
		this.orderDetailsRepository.save(orderDetails);
		return order;
	}
}
