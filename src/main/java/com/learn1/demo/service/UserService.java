package com.learn1.demo.service;

import com.learn1.demo.entity.User;
import com.learn1.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//实例化UserService
@Service
public class UserService {
    //实例化UserMapper
    @Autowired
    private UserMapper userMapper;
    public List<User> findAll(){
        return userMapper.findAll();
    }

    public void insert(User user){
        userMapper.insert(user);
    }

    @Transactional
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    @Transactional
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
