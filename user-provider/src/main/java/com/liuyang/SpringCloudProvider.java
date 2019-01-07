package com.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/7 11:04
 * Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProvider {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider.class,args);
    }
}
