package com.liuyang.service;

import com.liuyang.user.dto.User;
import com.liuyang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/7 10:48
 * Version 1.0
 **/
@Service
public class UserServiceProxy implements UserService {
    @Autowired
    private RestTemplate restTemplate;
    private static  final String CLOUD_PROVIDER = "http://cloud-provider";
    @Override
    public boolean save(User user) {

        User res = restTemplate.postForObject(CLOUD_PROVIDER + "/user/save", user, User.class);
        return res != null;
    }

    @Override
    public List<User> findAll() {
        List<User> res = restTemplate.getForObject(CLOUD_PROVIDER + "/user/findall", List.class);
        return res;
    }
}
