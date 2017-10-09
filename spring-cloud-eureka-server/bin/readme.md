# Eureka服务注册中心
1. 注册中心用来提供服务注册与发现，并对客户端调用服务时提供负载平衡。  
  	项目基于spring boot，需要添加jar包：  
	1). compile group: 'org.springframework.cloud', name: 'spring-cloud-starter-eureka-server', version: '1.3.0.RELEASE'  
2. 项目配置文件application.yml中指定了两个profile，方便演示Eureka集群。  
3. 主类处理spring boot注解为，需要额外添加注解@EnableEurekaServer  