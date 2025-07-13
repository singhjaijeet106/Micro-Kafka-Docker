package com.company.kafka.micro.user.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true)
	private String userid;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String username;
	@Column
	private String firstName;
	@Column
	private String lastName;
}
