package com.theotherprogrammingblog.spring.boot.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class SpringBootApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiGatewayApplication.class, args);
	}

}
