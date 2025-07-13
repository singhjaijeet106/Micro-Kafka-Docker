package com.company.kafka.micro.order.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.kafka.micro.order.model.ItemDetailDto;
import com.company.kafka.micro.order.repository.ItemDetailsRepository;
import com.company.kafka.micro.order.repository.entity.ItemDetail;
import com.company.kafka.micro.order.service.OrderService;
import com.company.kafka.micro.order.util.OrderServiceUtil;

@Repository
public class ItemDetailRepoImpl {
	private final ItemDetailsRepository itemDetailsRepository;

	public ItemDetailRepoImpl(ItemDetailsRepository itemDetailsRepository) {
		this.itemDetailsRepository = itemDetailsRepository;
	}
	
	
	public List<ItemDetailDto> saveItemsToOrder(List<ItemDetailDto> itemDetailDtos){
		List<ItemDetail> itemDetails = new ArrayList<>();
		for (ItemDetailDto itemDetailDto : itemDetailDtos) {
			itemDetails.add(OrderServiceUtil.convertToItemDetail(itemDetailDto));
		}
		
		itemDetailsRepository.saveAll(itemDetails);
		return itemDetailDtos;
	}
	
	public List<ItemDetailDto> getAllListByOrderId(String orderId){
		List<ItemDetailDto> itemDetailDtoList = new ArrayList<>();
		List<ItemDetail> itemDetails = itemDetailsRepository.findByOrderId(orderId);
		
		for (ItemDetail itemDetail : itemDetails) {
			itemDetailDtoList.add(OrderServiceUtil.convertToItemDetailDto(itemDetail));
		}
		return itemDetailDtoList;
	}
}
