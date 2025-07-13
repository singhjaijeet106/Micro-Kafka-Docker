package com.company.kafka.micro.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.kafka.micro.order.repository.entity.OrderHistory;

public interface OrderHistoryRepository extends JpaRepository<OrderHistory, Long>{

}
