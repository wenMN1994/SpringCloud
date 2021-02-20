package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //向服务注册中心进行注册
public class MicroserviceProductConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductConsumer_80.class, args);
    }
}
