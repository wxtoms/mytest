package com.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Dt82SoaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dt82SoaServiceApplication.class, args);
    }

}
