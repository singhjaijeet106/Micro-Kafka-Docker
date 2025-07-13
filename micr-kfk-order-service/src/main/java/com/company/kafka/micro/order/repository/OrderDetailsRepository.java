package com.company.kafka.micro.order.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.kafka.micro.order.repository.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

	Optional<OrderDetails> findByOrderId(String orderId);
}
