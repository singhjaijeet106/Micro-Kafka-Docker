package com.company.kafka.micro.inven.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	@GetMapping("/health")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("Inventory Service is running", HttpStatus.CREATED);
    }
}
