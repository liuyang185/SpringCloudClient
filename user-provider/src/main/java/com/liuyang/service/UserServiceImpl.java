package com.liuyang.service;

import com.liuyang.repository.UserRespository;
import com.liuyang.user.dto.User;
import com.liuyang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/7 10:54
 * Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;
    @Override
    public boolean save(User user) {
        return userRespository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRespository.finaAll();
    }
}
