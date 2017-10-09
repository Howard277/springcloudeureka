package com.ms.springcloudeurekaclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * rest请求模板配置
 * 
 * @author wuketao
 *
 */
@Configuration
public class RestTemplateConfig {

	@Bean
	@LoadBalanced // 开启均衡负载能力
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
