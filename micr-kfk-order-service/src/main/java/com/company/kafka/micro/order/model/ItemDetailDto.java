package com.company.kafka.micro.order.model;

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
public class ItemDetailDto {
	private String itemName;
	private double itemPrice;
	private int count;
	private String itemId;
	private String orderId;
}
