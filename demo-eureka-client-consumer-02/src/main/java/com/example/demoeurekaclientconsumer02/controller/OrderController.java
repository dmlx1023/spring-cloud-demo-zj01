package com.example.demoeurekaclientconsumer02.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequestMapping("ord")
@RestController
public class OrderController {
    @RequestMapping("test01")
    public int abtest() {
        return RandomUtils.nextInt(2);
    }
}
