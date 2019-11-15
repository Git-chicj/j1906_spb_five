package com.demo.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class J1906SpbDiscoverCApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbDiscoverCApplication.class, args);
    }

}
