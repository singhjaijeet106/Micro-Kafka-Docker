package com.company.kafka.micro.order.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_detail_list")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String itemName;
	private double itemPrice;
	private int count;
	private String itemId;
	private String orderId;
}
