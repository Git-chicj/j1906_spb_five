package com.demo.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class J1906SpbProducerBApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906SpbProducerBApplication.class, args);
    }

}
