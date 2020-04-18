package com.jkgl.ek;

import com.jkgl.ribbonConfig.RibbonRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author hecheng
 * @date 2020/3/23 22:19
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PAYMENT-SERVICE", configuration = RibbonRuleConfig.class)
public class OrderMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class, args);
    }
}