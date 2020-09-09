package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Class
 * @author naveensharma
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CartServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceAppApplication.class, args);
	}

}
