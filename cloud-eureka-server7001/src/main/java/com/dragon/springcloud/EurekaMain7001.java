package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2021-12-06 23:08
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
