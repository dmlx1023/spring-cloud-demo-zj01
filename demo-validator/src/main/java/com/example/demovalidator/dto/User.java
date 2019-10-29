package com.example.demovalidator.dto;

import com.example.demovalidator.validator.Sex;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotBlank(message = "名称不能为空")
    private String name;

    @Range(min = 1, max = 120, message = "年龄必须为1-120岁")
    private Integer age;

    @NotBlank(message = "描述不能为空")
    private String description;

    @NotNull
    @Length(min = 6, max = 18, message = "用户名长度必须为6-18位")
    private String username;

    @NotNull
    @Length(min = 6, max = 18, message = "密码长度必须为6-18位")
    private String password;
    @Sex
    private String sex;
}
