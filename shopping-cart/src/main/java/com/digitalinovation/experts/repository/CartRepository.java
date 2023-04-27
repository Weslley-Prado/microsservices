package com.digitalinovation.experts.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalinovation.experts.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
