package com.example.demoeurekaclientconsumer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaClientConsumer02Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaClientConsumer02Application.class, args);
    }


    @Bean
    @LoadBalanced
    RestTemplate getRestTmeplate() {
        return new RestTemplate();

    }
}
