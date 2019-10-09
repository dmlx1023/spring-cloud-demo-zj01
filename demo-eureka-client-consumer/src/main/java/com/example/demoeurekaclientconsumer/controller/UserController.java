package com.example.demoeurekaclientconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("userList/{id}")
    public List getUserList(@PathVariable int id) {
        ResponseEntity<List> l = restTemplate.getForEntity("http://eureka-client-01-provider/v1/userlist?id={1}", List.class, id);
        return l.getBody();
    }

    @PostMapping("userList")
    public List UserList(@RequestParam String id, @RequestParam String name) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
        params.add("id", id);
        params.add("name", name);
        HttpEntity h = new HttpEntity(params,null);
//        Map map = new HashMap();
//        map.put("id", id);
//        map.put("name", name);
//
//        HttpEntity h = new HttpEntity(map,null);
        ResponseEntity<List> l = restTemplate.exchange("http://eureka-client-01-provider/v1/userlist1", HttpMethod.POST,h, List.class);
        return l.getBody();

    }
}
