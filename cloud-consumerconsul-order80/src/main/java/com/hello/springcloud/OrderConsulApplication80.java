package com.hello.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zrj
 * @date 2021/1/24
 * @since V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class OrderConsulApplication80 {
    public static void main(String[] args) {
        SpringApplication.run( OrderConsulApplication80.class, args );
    }
}
