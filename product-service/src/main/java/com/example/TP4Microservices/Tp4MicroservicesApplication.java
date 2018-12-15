package com.example.TP4Microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Tp4MicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp4MicroservicesApplication.class, args);
	}
}
