package com.example.subproject19_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Subproject19GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Subproject19GatewayApplication.class, args);
    }

}
