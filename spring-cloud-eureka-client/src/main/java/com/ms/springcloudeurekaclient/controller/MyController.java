package com.ms.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

	/**
	 * 注入 具有负载均衡能力的rest模板
	 */
    @Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
    public String getSentence() {
		ResponseEntity<String> forEntity = restTemplate.getForEntity("http://spring-cloud-euraka-service/getWord/",
				String.class);
		return forEntity.getBody();
    }
}
