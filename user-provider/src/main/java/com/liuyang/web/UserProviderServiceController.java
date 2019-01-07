package com.liuyang.web;

import com.liuyang.user.dto.User;
import com.liuyang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/7 10:51
 * Version 1.0
 **/
@RestController
@RequestMapping("user")
public class UserProviderServiceController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public User addUser(@RequestBody User user){
        if(userService.save(user)){
            return user;
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
