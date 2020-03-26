package com.jkgl.ek.service;

import com.jkgl.ek.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(long id);
}
