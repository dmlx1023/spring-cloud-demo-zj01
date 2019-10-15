package com.example.demomocktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoMockTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMockTestApplication.class, args);
    }
    @RequestMapping("name")
    public String userName(){
        return "dmlx";
    }

}
