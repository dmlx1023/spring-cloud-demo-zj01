package com.example.demodataes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("es")
public class EsController {
    @Autowired

    private ElasticsearchTemplate template;
    @RequestMapping("doc")
    public String getDoc(){

        return "";
    }
}
