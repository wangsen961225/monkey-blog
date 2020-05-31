package com.ws.monkeyblog.controller;

import com.ws.monkeyblog.mapper.UserMapper;
import com.ws.monkeyblog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/queryUser")
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }

    @GetMapping("/queryUser/{id}")
    public User queryUserById(@PathVariable("id") Long id){
        return userMapper.queryUserById(id);
    }

    @GetMapping("addUser")
    public Long addUser(){
        User user = new User(null,"小花花","123456789","0","2020-02-31");
        return userMapper.addUser(user);
    }

    @GetMapping("updateUser")
    public int updateUser(){
        User user = new User(1L,"小猴子","sen107822","0","1996-12-25");
        return userMapper.updateUser(user);
    }

    @GetMapping("deleteUser/{id}")
    public int deleteUser(@PathVariable("id") Long id){
        return userMapper.deleteUser(id);
    }

}
