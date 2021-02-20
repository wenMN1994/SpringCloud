package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //向服务注册中心进行注册
//会扫描标记了指定包下@FeignClient注解的接口，并生成此接口的代理对象
@EnableFeignClients(basePackages= {"com.dragon.springcloud"})
public class MicroserviceProductConsumerFeign_80 {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductConsumerFeign_80.class, args);
    }
}
