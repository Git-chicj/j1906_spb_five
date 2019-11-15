package com.demo.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class J1906SpcZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpcZuulApplication.class, args);
    }

}
