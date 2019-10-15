package com.example.demonacosconfig;

import com.example.demonacosconfig.controller.RefreshListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.endpoint.event.RefreshEvent;

@SpringBootApplication

public class DemoNacosConfigApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DemoNacosConfigApplication.class, args);
    }
    @Autowired
    private RefreshListener listener;
    @Override
    public void run(String... args) throws Exception {
        listener.publishEvent(new RefreshEvent(this, null, "Refresh Nacos config"));

    }
}
