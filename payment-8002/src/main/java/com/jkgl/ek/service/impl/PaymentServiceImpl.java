package com.jkgl.ek.service.impl;

import com.jkgl.ek.dao.PaymentDao;
import com.jkgl.ek.entities.Payment;
import com.jkgl.ek.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hecheng
 * @date 2020/3/21 23:43
 */
@Service
public class PaymentServiceImpl implements PaymentService  {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
