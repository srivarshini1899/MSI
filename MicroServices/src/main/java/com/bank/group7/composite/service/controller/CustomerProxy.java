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

import com.bank.group7.composite.service.model.Customer;

@FeignClient(name="customer-app")
public interface CustomerProxy {
	
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getById(@PathVariable (value = "id") int CustId);
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCust();
	
	@PostMapping("/createCustomer")
	public ResponseEntity<Customer> create(@RequestBody Customer cust);
	
	@PutMapping("/updateCustomer/{id}")
	public Customer updateById(@PathVariable (value = "id") int CustId, @RequestBody Customer cust);
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteById(@PathVariable (value = "id") int CustId);

}
