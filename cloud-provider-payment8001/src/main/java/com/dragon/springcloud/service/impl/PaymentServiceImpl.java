package com.dragon.springcloud.service.impl;

import com.dragon.springcloud.dao.PaymentDao;
import com.dragon.springcloud.entities.Payment;
import com.dragon.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2021-12-04 15:17
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
