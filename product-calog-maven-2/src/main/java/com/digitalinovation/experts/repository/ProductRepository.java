package com.digitalinovation.experts.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalinovation.experts.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
