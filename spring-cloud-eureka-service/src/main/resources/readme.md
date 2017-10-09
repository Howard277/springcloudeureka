# Eureka服务提供者程序
1. 服务提供者向Eureka注册，并提供http协议的服务接口。
	项目基于spring boot，需要添加jar包：
	1). compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-eureka-server', version: '1.3.0.RELEASE'
2. 主类处理spring boot注解为，需要额外添加注解@EnableDiscoveryClient  

