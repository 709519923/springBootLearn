package com.learn1.demo.mapper;

import com.learn1.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //从数据库中拿出的是对象
    List<User> findAll();

    void insert(User user);

    void deleteUserById(int id);

    void updateUser(User user);
}
