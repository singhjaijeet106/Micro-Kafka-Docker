package com.company.kafka.micro.order.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderDetailsDto {
	private String orderId;
	private double itemTotal;
	private double shippingCharge;
	private int taxPercentage;
	private double grandTotal;
	private LocalDate orderPlaced;
	private LocalDate orderShipped;
	private List<ItemDetailDto> itemDetails;
}
