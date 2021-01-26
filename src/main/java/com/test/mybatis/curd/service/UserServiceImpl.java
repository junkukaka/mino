package com.test.mybatis.curd.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.mybatis.curd.mapper.UserMapper;
import com.test.mybatis.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    @Resource
    UserMapper userMapper;

    @Override
    public void saveUser(User User) {
        userMapper.insert(User);
    }

    @Override
    public void deleteById(long id) {
        userMapper.deleteById(id);
    }

    @Override
    public User getUser(long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getAll() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("name","email","age");
        return userMapper.selectList(userQueryWrapper);
    }

    @Override
    public void updatePeron(User User) {

    }
}
