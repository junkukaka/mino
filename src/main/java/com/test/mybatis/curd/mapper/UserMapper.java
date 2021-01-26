package com.test.mybatis.curd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {

}

