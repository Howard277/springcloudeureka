# Eureka服务调用者程序
1. 调用Eureka上注册的服务。
	项目基于spring boot，需要添加jar包：  
	1). compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-eureka-server', version: '1.3.0.RELEASE'  
	2). compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-ribbon', version: '1.3.0.RELEASE'  
2. 主类除了spring boot注解外，需要额外添加注解@EnableEurekaClient   
3. 增加com.ms.springcloudeurekaclient.config.RestTemplateConfig配置类，提供具有负载均衡功能的RestTemplate。
 

