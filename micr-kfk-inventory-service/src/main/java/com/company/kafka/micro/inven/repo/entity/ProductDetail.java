package com.company.kafka.micro.inven.repo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="product_details")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductDetail {

	@Id
	private String id;
	private String name;
	private String description;
}
