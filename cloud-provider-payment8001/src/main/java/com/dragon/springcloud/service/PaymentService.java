package com.dragon.springcloud.service;

import com.dragon.springcloud.entities.Payment;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2021-12-04 15:17
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
public interface PaymentService {
    /**
     * 创建支付信息
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据支付ID获取支付信息
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
