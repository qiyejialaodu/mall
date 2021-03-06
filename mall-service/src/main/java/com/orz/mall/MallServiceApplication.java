package com.orz.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//表示服务发现
@MapperScan({"com.orz.**.mapper","org.orz.**.mapper"})
@EnableCircuitBreaker
public class MallServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallServiceApplication.class, args);
    }

}
