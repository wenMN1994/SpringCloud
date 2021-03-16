package com.dragon.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DragonWen
 */
@SpringBootApplication
@MapperScan("com.dragon.springcloud.mapper") //扫描所有Mapper接口
@EnableEurekaClient //本服务启动后会自动注册进Eureka中心
public class MicroserviceProductProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProductProvider_8001.class, args);
    }
}
