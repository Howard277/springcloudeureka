package com.ms.springcloudeurekaservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController("/")
public class MyController {
	String words = "中国,俄罗斯,英国";
	
	@Value("${spring.application.name}")
	private String applicationName;

	@RequestMapping(path = "/getWord", method = RequestMethod.GET)
	public String getWord() {
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		String result = wordArray[i];
		log.info(applicationName+":"+result);
		return result;
	}
}
