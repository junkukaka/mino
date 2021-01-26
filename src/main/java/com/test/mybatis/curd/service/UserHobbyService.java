package com.test.mybatis.curd.service;


import com.test.mybatis.pojo.UserHobby;

import java.util.List;

public interface UserHobbyService {
    void saveUserHobby(UserHobby userHobby);
    void deleteUserHobby(long userId);
    UserHobby getUserHobbyHobby(long userId);
    List<UserHobby> getAll();
    void updatePeron(UserHobby UserHobby);
}
