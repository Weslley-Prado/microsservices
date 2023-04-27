package com.digitalinovation.experts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinovation.experts.model.Cart;
import com.digitalinovation.experts.model.Item;
import com.digitalinovation.experts.repository.CartRepository;

@RestController
@RequestMapping(value = "/cart")
public class CartController {
	
	@Autowired
	private CartRepository cartRepository;
	
	@PostMapping(value="/{id}")
	public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
		Optional<Cart> savedCart = cartRepository.findById(id);
		Cart cart;
		if(savedCart.equals(Optional.empty())) {
			cart = new Cart(id);
		}
		else {
			cart = savedCart.get();
		}
		cart.getItems().add(item);
		return cartRepository.save(cart);
	}
	@GetMapping(value = "/{id}")
	public Optional<Cart> findById(@PathVariable("id") Integer id){
		return cartRepository.findById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void clear(@PathVariable("id") Integer id){
		 cartRepository.deleteById(id);
	}

}
