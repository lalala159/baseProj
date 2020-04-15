package com.jkgl.ek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka7003Main {


    public static void main(String[] args) {
        SpringApplication.run(Eureka7003Main.class, args);
    }

}
