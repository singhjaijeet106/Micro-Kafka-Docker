package com.company.kafka.micro.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.kafka.micro.order.model.OrderDetailsDto;
import com.company.kafka.micro.order.repository.entity.OrderDetails;
import com.company.kafka.micro.order.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
    
    @PostMapping
    public ResponseEntity<OrderDetailsDto> createOrder(@RequestBody OrderDetailsDto orderDetails) {
        OrderDetailsDto createdOrder = orderService.createOrder(orderDetails);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
    
    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDetailsDto> createOrder(@PathVariable String orderId) {
        OrderDetailsDto createdOrder = orderService.getOrderById(orderId);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
}
