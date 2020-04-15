package com.jkgl.order.controller;

import com.jkgl.ek.entities.CommonResult;
import com.jkgl.ek.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author hecheng
 * @date 2020/3/23 22:10
 */
@RestController
@Slf4j
@RequestMapping(value = "order")
public class OrderController {
    public static final String PAYMENT_URL = "http://PAYMENT-SERVICE";

    @Resource
    RestTemplate restTemplate;

    @GetMapping("pay")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/pay/add", payment, CommonResult.class);
    }

    @GetMapping("get")
    public CommonResult<Payment> get(int id){
        return restTemplate.getForObject(PAYMENT_URL+"/pay/get?id="+id, CommonResult.class);
    }
}
