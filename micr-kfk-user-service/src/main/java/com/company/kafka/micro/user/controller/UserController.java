package com.company.kafka.micro.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@GetMapping("/health")
	public ResponseEntity<String> checkHealth() {
		return new ResponseEntity<>("User Service is running", HttpStatus.CREATED);
	}
}
