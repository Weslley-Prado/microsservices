package com.digitalinovation.experts.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {
	private Integer productId;
	private Integer amount;
	public Item() {
	}
	public Item(Integer productId, Integer amount) {
		super();
		this.productId = productId;
		this.amount = amount;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getMount() {
		return amount;
	}
	public void setMount(Integer amount) {
		this.amount = amount;
	}
	
	
	
	

}
