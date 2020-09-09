package com.bank.group7.composite.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author naveensharma
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.bank.group7.composite.service")
public class CompositeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate template(RestTemplateBuilder builder) {
		return builder.build();
	}

}
