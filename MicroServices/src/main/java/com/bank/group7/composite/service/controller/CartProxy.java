package com.bank.group7.composite.service.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.group7.composite.service.model.Cart;

@FeignClient(name="Cart-implementation")
public interface CartProxy {
	
	@GetMapping("/getCart/{id}")
	public ResponseEntity<Cart> getById(@PathVariable (value = "id") int CartId);
	
	@GetMapping("/getAllCarts")
	public List<Cart> getAllCart();
	
	@PostMapping("/createCart")
	public ResponseEntity<Cart> create(@RequestBody Cart cart2);
	
	@PutMapping("/updateCart/{id}")
	public Cart updateById(@PathVariable (value = "id") int CartId, @RequestBody Cart cart);
	
	@DeleteMapping("/deleteCart/{id}")
	public String deleteById(@PathVariable (value = "id") int CartId);

}
