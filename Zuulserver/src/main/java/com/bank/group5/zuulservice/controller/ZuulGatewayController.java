package com.bank.group5.zuulservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bank.group5.zuulservice.model.Customer;
import com.bank.group5.zuulservice.model.Product;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class ZuulGatewayController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private EurekaClient client;
	
	
	
	@GetMapping("/api/customer")
	
	public String InvokeService() {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("customer-app", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/customer";
		System.out.println("BaseUrl:"+baseUrl);
		return template.getForObject(baseUrl, String.class);
	}
	
	
	
	@PostMapping("/api/customer/createCustomer")
	
	public Customer InvokeService2(@RequestBody Customer cust) {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("customer-app", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/customer/createCustomer";
		System.out.println("BaseUrl:"+baseUrl);
		Customer createCust= template.postForObject(baseUrl,cust,Customer.class);
		return createCust;
	}
	
	
	
	@GetMapping("/api/customer/getCustomer/{id}")	
	public Customer InvokeService3(@PathVariable (value="id") int id) {
		
		InstanceInfo instanceInfo = client.getNextServerFromEureka("customer-app", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/customer/getCustomer/"+id;
		System.out.println("BaseUrl:"+baseUrl);
		Customer getCust = template.getForObject(baseUrl, Customer.class);
		return getCust;
	}
	
	
	
	@PutMapping("/api/customer/updateCustomer/{id}")
	
	public Customer InvokeService4(@PathVariable (value="id") int id, @RequestBody Customer cust) {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("customer-app", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/customer/updateCustomer/"+id;
		System.out.println("BaseUrl:"+baseUrl);
		Customer cust5= template.getForObject(baseUrl, Customer.class);
		return cust5;
	}
	
	
	
	@DeleteMapping("/api/customer/deleteCustomer/{id}")
	
	public Customer InvokeService5(@PathVariable (value="id") int id) {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("customer-app", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/customer/deleteCustomer/"+id;
		System.out.println("BaseUrl:"+baseUrl);
		return template.getForObject(baseUrl, Customer.class);
	}
	
	
	
	@GetMapping("/api/product")
	
	public String InvokeService6() {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("Product_implementation", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/product";
		System.out.println("BaseUrl:"+baseUrl);
		return template.getForObject(baseUrl, String.class);
	}
	
	
	
	@PostMapping("/api/product/createProduct")
	
	public Product InvokeService7(@RequestBody Product prod) {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("Product_implementation", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/product/createProduct";
		System.out.println("BaseUrl:"+baseUrl);
		Product createProd= template.postForObject(baseUrl,prod,Product.class);
		return createProd;
		
	}
	
	
	
	@GetMapping("/api/product/getProduct/{id}")
	
	public Product InvokeService8(@PathVariable (value="id") int id) {
		
		InstanceInfo instanceInfo = client.getNextServerFromEureka("Product_implementation", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/product/getProduct/"+id;
		System.out.println("BaseUrl:"+baseUrl);
		Product prod10 = template.getForObject(baseUrl, Product.class);
		return prod10;
	}
	
	
	
	@PutMapping("/api/product/updateProduct/{id}")
	
	public Product InvokeService9(@PathVariable (value="id") int id, @RequestBody Product prod) {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("Product_implementation", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/product/updateProduct/"+id;
		System.out.println("BaseUrl:"+baseUrl);
		Product prod11= template.getForObject(baseUrl, Product.class);
		return prod11;
	}
	
	
	
	@DeleteMapping("/api/product/deleteProduct/{id}")
	
	public Product InvokeService10(@PathVariable (value="id") int id) {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("Product_implementation", false);
		String baseUrl = instanceInfo.getHomePageUrl() + "api/product/deleteProduct/"+id;
		System.out.println("BaseUrl:"+baseUrl);
		return template.getForObject(baseUrl, Product.class);
	}
	
	
	
}