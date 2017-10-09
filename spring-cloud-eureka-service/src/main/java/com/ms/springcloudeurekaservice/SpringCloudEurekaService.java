package com.ms.springcloudeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!<br/>
 * 启动server
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
// @EnableDiscoveryClient
public class SpringCloudEurekaService {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaService.class, args);
    }
}
