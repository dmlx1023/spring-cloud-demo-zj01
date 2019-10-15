package com.example.demoeurekaclientfeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("eureka-client-01-provider")
@RequestMapping("v1")
public interface FeignService {

    @GetMapping("userlist")
    public List getUserList(int id);
}
