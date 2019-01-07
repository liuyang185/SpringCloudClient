package com.liuyang.repository;

import com.liuyang.user.dto.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/7 10:55
 * Version 1.0
 **/
@Repository
public class UserRespository {

    private AtomicLong id = new AtomicLong(0);
    private ConcurrentHashMap<Long, User> concurrentHashMap = new ConcurrentHashMap();
    public List finaAll(){
        return Arrays.asList(concurrentHashMap.values());
    }
    public boolean save(User user){
        user.setId(id.getAndIncrement());
        return concurrentHashMap.putIfAbsent(user.getId(),user) == null;
    }
}
