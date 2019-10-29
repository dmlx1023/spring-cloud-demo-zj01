package com.example.demodataredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

@SpringBootApplication
public class DemoDataRedisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoDataRedisApplication.class, args);
    }

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public void run(String... args) throws Exception {
        ValueOperations v = redisTemplate.opsForValue();
//        for (int i = 0; i < 10; i++) {
//            v.setBit("b", i, i % 2 == 0 ? true : false);
//        kkkkkkkkkkkllllllllllliiiiiiiiiiiiiinnnnnnnnnnnnnnnnnnmmmmmmmmmmmmmmmmmm,,,,,,,,,,,,,,,,,,aaaaaaaaaaasssssssssq
//        }
        System.out.println(v.getBit("b", 1));
        System.out.println(v.getBit("b", 3));
        byte[] bs = String.valueOf(v.get("b")).getBytes();
        for (byte b : bs) {
            System.out.println(b);
        }
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()).format(d);
        System.out.println(s);
    }
}
