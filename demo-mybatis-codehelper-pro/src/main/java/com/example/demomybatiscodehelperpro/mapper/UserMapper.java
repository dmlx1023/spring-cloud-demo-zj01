package com.example.demomybatiscodehelperpro.mapper;

import com.example.demomybatiscodehelperpro.dao.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User record);
}