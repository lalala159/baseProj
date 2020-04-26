package com.jkgl.ek.service;

import com.jkgl.ek.entities.CommonResult;
import com.jkgl.ek.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/pay/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
