package com.company.kafka.micro.order.util;

import java.util.ArrayList;
import java.util.List;

import com.company.kafka.micro.order.model.ItemDetailDto;
import com.company.kafka.micro.order.model.OrderDetailsDto;
import com.company.kafka.micro.order.repository.entity.ItemDetail;
import com.company.kafka.micro.order.repository.entity.OrderDetails;

public class OrderServiceUtil {
	private OrderServiceUtil() {}
	
	public static OrderDetailsDto convertToOrderDetailsDto(OrderDetails orderDetails) {
		OrderDetailsDto orderDetailsDto = OrderDetailsDto.builder()
		.orderId(orderDetails.getOrderId())
		.itemTotal(orderDetails.getItemTotal())
		.shippingCharge(orderDetails.getShippingCharge())
		.taxPercentage(orderDetails.getTaxPercentage())
		.grandTotal(orderDetails.getGrandTotal())
		.orderPlaced(orderDetails.getOrderPlaced())
		.orderShipped(orderDetails.getOrderPlaced())
		.build();
		List<ItemDetailDto> list = new ArrayList<>();
		for (ItemDetail itemDetail : orderDetails.getItemDetails()) {
			list.add(convertToItemDetailDto(itemDetail));
		}
		orderDetailsDto.setItemDetails(list);
		return orderDetailsDto;
	}
	
	public static OrderDetails convertToOrderDetails(OrderDetailsDto orderDetailsDto) {
		OrderDetails orderDetails = OrderDetails.builder()
				.orderId(orderDetailsDto.getOrderId())
				.itemTotal(orderDetailsDto.getItemTotal())
				.shippingCharge(orderDetailsDto.getShippingCharge())
				.taxPercentage(orderDetailsDto.getTaxPercentage())
				.grandTotal(orderDetailsDto.getGrandTotal())
				.orderPlaced(orderDetailsDto.getOrderPlaced())
				.orderShipped(orderDetailsDto.getOrderPlaced())
				.build();
		return orderDetails;
	}
	
	public static ItemDetailDto convertToItemDetailDto(ItemDetail itemDetail ) {
		ItemDetailDto itemDetailDto = ItemDetailDto.builder()
				.itemId(itemDetail.getItemId())
				.itemName(itemDetail.getItemName())
				.count(itemDetail.getCount())
				.itemPrice(itemDetail.getItemPrice())
				.orderId(itemDetail.getOrderId())
				.build();
		return itemDetailDto;
	}
	
	
	public static ItemDetail convertToItemDetail(ItemDetailDto itemDetailDto ) {
		ItemDetail itemDetail = ItemDetail.builder()
				.itemId(itemDetailDto.getItemId())
				.itemName(itemDetailDto.getItemName())
				.count(itemDetailDto.getCount())
				.itemPrice(itemDetailDto.getItemPrice())
				.orderId(itemDetailDto.getOrderId())
				.build();
		return itemDetail;
	}
}
