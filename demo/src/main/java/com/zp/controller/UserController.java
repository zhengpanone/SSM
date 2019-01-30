package com.zp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zp.dao.UserMapper;
import com.zp.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;


    @RequestMapping(value = {"/test"})
    public String test() {
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = {"/addUser"}, method = RequestMethod.POST)
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @RequestMapping(value = {"/selectUserById"}, method = RequestMethod.GET)
    public User selectUserById(String id) {
        User user = userMapper.selectUserById(Integer.parseInt(id));
        return user;
    }

    @RequestMapping(value = {"/updateUser"}, method = RequestMethod.POST)
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @RequestMapping(value = {"/deleteUser"}, method = RequestMethod.POST)
    public void deleteUser(String id) {
        userMapper.deleteUser(Integer.parseInt(id));
    }

}
