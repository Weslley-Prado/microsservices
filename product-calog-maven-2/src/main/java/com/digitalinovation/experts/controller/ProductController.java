package com.digitalinovation.experts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinovation.experts.model.Product;
import com.digitalinovation.experts.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired(required=true)
	private ProductRepository productRepository;
	
	@PostMapping
	Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping(value = "/{id}")
	Optional<Product> findById(@PathVariable Long id) {
		return productRepository.findById(id);
	}
}
