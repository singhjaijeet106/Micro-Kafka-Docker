package com.company.kafka.micro.order.repository.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_history_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String orderId;
	private String oldStatus;
	private String newStatus;
	private String changeSummary; 
	private String action;
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime changedAt;

	@PrePersist
	public void setChangeTime() {
		changedAt = LocalDateTime.now();
	}
}
