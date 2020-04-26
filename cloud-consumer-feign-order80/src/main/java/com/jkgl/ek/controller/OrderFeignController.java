package com.jkgl.ek.controller;

import com.jkgl.ek.entities.CommonResult;
import com.jkgl.ek.entities.Payment;
import com.jkgl.ek.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaumentByid(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }
}
