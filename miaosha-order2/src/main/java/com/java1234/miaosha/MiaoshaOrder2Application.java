package com.java1234.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.java1234.miaosha.mapper")
@EnableDiscoveryClient
public class MiaoshaOrder2Application {

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaOrder2Application.class, args);
    }

}

