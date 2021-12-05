package com.dragon.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2021-12-05 22:29
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
