package com.liuyang.web.controller;

import com.liuyang.user.dto.User;
import com.liuyang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/4 15:25
 * Version 1.0
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public User addUser(@RequestParam String name){
        User u = new User();
        u.setUserName(name);
        u.setAge(11);
        if(userService.save(u)){
            return u;
        }
        else{
            return  null;
        }
    }
    @GetMapping("/findall")
    public List<User> listUsers(){
        return userService.findAll();
    }
}
