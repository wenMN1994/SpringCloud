package com.dragon.springcloud.controller;

import com.dragon.springcloud.entities.CommonResult;
import com.dragon.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2021-12-05 22:31
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
@RestController
public class OrderController {
    // public static final String PAYMENT_SRV_URL = "http://localhost:8001";
    /**通过在eureka上注册过的微服务名称调用*/
    public static final String PAYMENT_SRV_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_SRV_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id)
    {
        return restTemplate.getForObject(PAYMENT_SRV_URL + "/payment/get/"+id, CommonResult.class, id);
    }
}
