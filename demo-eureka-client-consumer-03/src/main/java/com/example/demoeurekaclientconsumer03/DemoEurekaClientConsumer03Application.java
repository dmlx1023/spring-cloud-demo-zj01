package com.example.demoeurekaclientconsumer03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.example.demoeurekaclientconsumer03"})
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DemoEurekaClientConsumer03Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaClientConsumer03Application.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate getRestTmeplate() {
        return new RestTemplate();

    }
}
