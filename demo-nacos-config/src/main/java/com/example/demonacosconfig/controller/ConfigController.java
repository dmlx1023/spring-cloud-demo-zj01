package com.example.demonacosconfig.controller;

import com.example.demonacosconfig.config.OrdConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
//@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${cw}")
//    @Value("${cw:ddddd}")
    private String name;
    @Autowired
    private OrdConfiguration configuration;
    @RequestMapping("/get")
    public String get() {
        return configuration.getName();
    }
}
