package com.example.demoeurekaclientfeignconsumer.controller;

import com.example.demoeurekaclientfeignconsumer.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestFeignController {
    @Resource
    private FeignService feignService;
    @GetMapping("feign")
    public List getFeign(){
        return feignService.getUserList(1);
    }
}
