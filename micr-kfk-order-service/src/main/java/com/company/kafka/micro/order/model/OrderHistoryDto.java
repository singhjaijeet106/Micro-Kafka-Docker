package com.company.kafka.micro.order.model;

import java.time.LocalDateTime;

import com.company.kafka.micro.order.constant.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderHistoryDto {
	private String orderId;
	private OrderStatus oldStatus;
	private OrderStatus newStatus;
	private String changeSummary; 
	private String action;
	private LocalDateTime changedAt;
}
