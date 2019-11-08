package com.example.demomybatiscodehelperpro.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.example.demomybatiscodehelperpro.dao.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    int insert(User record);

    List<User> selectAllById(@Param("id") Integer id);

    List<User> getAllByUpdatetimeAndIdAfterAndAgeAfter(@Param("updatetime") Date updatetime, @Param("minId") Integer minId, @Param("minAge") Integer minAge);

    int updateByIdAndIdLessThan(@Param("updated") User updated, @Param("id") Integer id, @Param("maxId") Integer maxId);
    Integer getageByIdBetweenAndAgeAndId(@Param("minId")Integer minId,@Param("maxId")Integer maxId,@Param("age")Integer age,@Param("id")Integer id);



}