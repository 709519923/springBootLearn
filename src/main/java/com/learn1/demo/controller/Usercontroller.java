package com.learn1.demo.controller;

import com.learn1.demo.entity.User;
import com.learn1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Usercontroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/home1")
    public Animal getName(){
        return new Animal("dog", 16);
    }

    @RequestMapping("/read_test") //查
    public List<User> getUser(){
        return userService.findAll();
     }

    @RequestMapping("/insert_test") // 增
    public void insert(@RequestBody User user) {
        userService.insert(user);
    }

    @DeleteMapping("/{id}") //删
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUserById(id);
    }

    @PutMapping("/update_test") // 改
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
}
