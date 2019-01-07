package com.liuyang.user.service;

import com.liuyang.user.dto.User;

import java.util.List;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/4 15:17
 * Version 1.0
 **/
public interface UserService {
    boolean save(User user);
    List<User> findAll();
}
