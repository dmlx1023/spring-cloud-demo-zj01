package com.example.demovalidator.dto;

import com.example.demovalidator.validator.FieldCheck;
import com.example.demovalidator.validator.FieldType;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class User {

    private String name;

    private Integer age;
    private String username;

    private String password;

    private String description;

    /**
     * 期望通过单个文件规范请求字段校验方式
     */
    @NotNull
    @FieldCheck(FieldType.MONEY)
    private String money;


}
