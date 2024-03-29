package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayserviceApplication.class, args);
	}

}
