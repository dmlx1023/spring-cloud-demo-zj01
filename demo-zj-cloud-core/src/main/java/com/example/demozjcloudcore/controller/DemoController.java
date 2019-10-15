package com.example.demozjcloudcore.controller;

import com.example.demozjcloudcore.helper.ResponseHelper;
import com.example.demozjcloudcore.helper.ZJResponse;
import com.zijinph.core.dto.BaseResponse;
import com.zijinph.core.enums.ReturnCode;
import com.zijinph.core.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ZJResponse
public class DemoController {

    @RequestMapping("t1")
    private User h() {
        User user = new User("我是名称", "我是id");
        if (Boolean.TRUE) {
            throw new NullPointerException("我是业务异常！");
        }
        return user;
    }

    @RequestMapping("t2")
    @ZJResponse
    private User h2() {
        User user = new User("我是名称", "我是id");
        return user;
    }

    @RequestMapping("t3")
    private BaseResponse<User> h3() {
        BaseResponse<User> response = new BaseResponse<>();
        User user = new User("我是名称", "我是id");
        response.setCode(ReturnCode.SUCCESS.getCode());
        response.setMessage(ReturnCode.SUCCESS.getMessage());
        response.setResult(user);
        return response;
    }

    @RequestMapping("t4")
    private ResponseEntity<BaseResponse<User>> h4() {
        BaseResponse<User> response = new BaseResponse<>();
        User user = new User("我是名称", "我是id");
        response.setCode(ReturnCode.SUCCESS.getCode());
        response.setMessage(ReturnCode.SUCCESS.getMessage());
        response.setResult(user);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping("t5")
    private ResponseEntity<BaseResponse<User>> h5() {
        BaseResponse<User> response = new BaseResponse<>();
        User user = new User("我是名称", "我是id");
        response.setCode(ReturnCode.SUCCESS.getCode());
        response.setMessage(ReturnCode.SUCCESS.getMessage());
        response.setResult(user);
        if (true) {
            throw new RuntimeException();
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping("t6")
    private ResponseEntity<BaseResponse<User>> h6() {
        return null;
    }

    @RequestMapping("t7")
    private ResponseEntity<BaseResponse<User>> h7() {
        BaseResponse<User> response = new BaseResponse<>();
        User user = new User("我是名称", "我是id");
        return new ResponseEntity(ResponseHelper.success(user), HttpStatus.OK);
    }

    @RequestMapping("t8")
    private BaseResponse<User> h8() {
        User user = new User("我是名称", "我是id");
        return ResponseHelper.success(user);
    }

    @RequestMapping("t9")
    private User h9() {
        User user = new User("我是名称", "我是id");
        if (Boolean.TRUE) {
            throw new BusinessException("我是业务异常！");
        }
        return user;
    }

    @RequestMapping("t10")
    private ResponseEntity<User> h10() {
        User user = new User("我是名称", "我是id");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
