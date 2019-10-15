package com.example.demoeurekaclientconsumer03.controller;

import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Level;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("userList/{id}")
    @HystrixCommand(fallbackMethod = "failFallback")
    public List getUserList(@PathVariable int id) {
        if (true){
            throw new IllegalStateException();
        }
        ResponseEntity<List> l = restTemplate.getForEntity("http://eureka-client-01-provider/v1/userlist?id={1}", List.class, id);
        return l.getBody();
    }

    @PostMapping("userList")
    @HystrixCommand(fallbackMethod ="failFallback" )
    public List UserList(@RequestParam String id, @RequestParam String name) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
        params.add("id", id);
        params.add("name", name);
        HttpEntity h = new HttpEntity(params,null);
//        Map map =  new HashMap();
//        map.put("id", id);
//        map.put("name", name);
//
//        HttpEntity h = new HttpEntity(map,null);
        ResponseEntity<List> l = restTemplate.exchange("http://eureka-client-01-provider/v1/userlist1", HttpMethod.POST,h, List.class);
        return l.getBody();

    }

    public List failFallback( String id, String name){
        List l = Lists.newArrayList("失败");
        return l;
    }

    public List failFallback( int id,Throwable throwable) throws Throwable {
       log.error("=======================请求失败 {}：：========",id);
        List l = Lists.newArrayList("失败laaalaaaaaaaaa");
        return l;
    }
}
