package com.example.demodataes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("es")
public class EsController {

    @RequestMapping("doc")
    public String getDoc() {

        return "";
    }

}
