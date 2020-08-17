package com.rahuls.spring.zuul.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Rahul S
 *
 *can add/integarte with eureka server
 */
@SpringBootApplication
@EnableZuulProxy
public class SupplierGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierGatewayApplication.class, args);
	}
}
