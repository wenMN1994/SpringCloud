package com.dragon.springcloud.dao;

import com.dragon.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2021-12-04 15:21
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
@Mapper
public interface PaymentDao {
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
    Payment getPaymentById(@Param("id") Long id);
}
