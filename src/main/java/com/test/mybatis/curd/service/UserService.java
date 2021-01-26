package com.test.mybatis.curd.service;

import com.test.mybatis.pojo.User;

import java.util.List;

public interface UserService {
    void saveUser(User User);
    void deleteById(long id);
    User getUser(long id);
    List<User> getAll();
    void updatePeron(User User);
}
