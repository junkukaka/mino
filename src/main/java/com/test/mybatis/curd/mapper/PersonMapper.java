package com.test.mybatis.curd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.mybatis.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper extends BaseMapper<Person> {
     List<Person> selectAll();
}
