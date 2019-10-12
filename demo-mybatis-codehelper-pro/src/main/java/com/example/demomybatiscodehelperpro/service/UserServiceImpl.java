package com.example.demomybatiscodehelperpro.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demomybatiscodehelperpro.mapper.UserMapper;
import com.example.demomybatiscodehelperpro.dao.User;
import com.example.demomybatiscodehelperpro.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

}

