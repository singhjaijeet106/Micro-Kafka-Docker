package com.company.kafka.micro.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.kafka.micro.order.repository.entity.ItemDetail;

public interface ItemDetailsRepository  extends JpaRepository<ItemDetail, Long>{
	List<ItemDetail> findByOrderId(String orderId);
	Optional<ItemDetail> findByOrderIdAndItemId(String orderId,String itemId);
}
