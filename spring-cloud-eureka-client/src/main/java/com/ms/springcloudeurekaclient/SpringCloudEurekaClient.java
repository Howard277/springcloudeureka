package com.ms.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClient {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient.class, args);
	}
}
