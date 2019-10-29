package com.example.demovalidator.controller;

import com.example.demovalidator.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class UserController {
    @GetMapping("/insert")
    @ResponseBody
    public String insertUser(@Valid User user) {
        return "校验通过";
    }
}
