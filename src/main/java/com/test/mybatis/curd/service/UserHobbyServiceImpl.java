package com.test.mybatis.curd.service;

import com.test.mybatis.curd.mapper.UserHobbyMapper;
import com.test.mybatis.pojo.UserHobby;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserHobbyServiceImpl implements UserHobbyService {

    @Resource
    UserHobbyMapper userHobbyMapper;

    @Override
    public void saveUserHobby(UserHobby userHobby) {
        userHobbyMapper.insert(userHobby);
    }

    @Override
    public void deleteUserHobby(long userId) {

    }

    @Override
    public UserHobby getUserHobbyHobby(long userId) {
        return null;
    }

    @Override
    public List<UserHobby> getAll() {
        return null;
    }

    @Override
    public void updatePeron(UserHobby UserHobby) {

    }
}
