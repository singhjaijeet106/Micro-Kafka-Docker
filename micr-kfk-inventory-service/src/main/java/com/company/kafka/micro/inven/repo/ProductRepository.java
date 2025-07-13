package com.company.kafka.micro.inven.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.kafka.micro.inven.repo.entity.ProductDetail;

public interface ProductRepository extends MongoRepository<ProductDetail, String>{

}
