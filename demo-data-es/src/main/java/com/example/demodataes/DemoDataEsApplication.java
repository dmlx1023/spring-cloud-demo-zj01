package com.example.demodataes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class DemoDataEsApplication implements CommandLineRunner {
    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DemoDataEsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        elasticsearchTemplate.createIndex("dmlx");
    }
}
