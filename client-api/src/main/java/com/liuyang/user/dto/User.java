package com.liuyang.user.dto;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/1/4 15:18
 * Version 1.0
 **/
public class User {
    private Long id;
    private String userName;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
