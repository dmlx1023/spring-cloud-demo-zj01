package com.example.demovalidator.controller;

import com.example.demovalidator.dto.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class UserController {
    @GetMapping("/insert")
    @ResponseBody
    public String insertUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            StringBuffer sb = new StringBuffer();
            for (ObjectError error : result.getAllErrors()) {
                sb=sb.append(":\n").append(error.getDefaultMessage());
            }
            return sb.toString();
        }
        return "校验通过";
    }
}
