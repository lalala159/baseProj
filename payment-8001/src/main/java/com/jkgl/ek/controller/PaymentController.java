package com.jkgl.ek.controller;

import com.jkgl.ek.entities.CommonResult;
import com.jkgl.ek.entities.Payment;
import com.jkgl.ek.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hecheng
 * @date 2020/3/21 23:44
 */
@RestController
@RequestMapping(value = "pay")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "add")
    public CommonResult add(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        return new CommonResult(200, "成功", result);
    }

    @GetMapping(value = "get")
    public CommonResult get(long id){
       Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200, "成功", payment);
    }
}
