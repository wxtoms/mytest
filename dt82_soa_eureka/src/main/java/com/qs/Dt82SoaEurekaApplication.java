package com.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   // 允许启用注册中心服务器
public class Dt82SoaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dt82SoaEurekaApplication.class, args);
    }

}
