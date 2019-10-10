package com.example.demoeurekaclient.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1")
public class HelloController {

    @GetMapping("userlist")
    public List getUserList(@RequestParam(required = false) Object id) {
        List l = new ArrayList();
//        l.add(1);
//        l.add(6);
//        l.add(2);
        l.add(id);
        return l;

    }


    @PostMapping("userlist1")
    public List UserList(@RequestParam("id") String id, @RequestParam("name") String name) throws InterruptedException {
        List l = new ArrayList();
//        TimeUnit.SECONDS.sleep(20);
//        if (RandomUtils.nextBoolean()){
//            throw new IllegalStateException("2222222222222222");
//        }
        l.add(id);
        l.add(name);
        return l;

    }

}
