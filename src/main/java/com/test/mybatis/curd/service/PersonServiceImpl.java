package com.test.mybatis.curd.service;

import com.test.mybatis.curd.mapper.PersonMapper;
import com.test.mybatis.pojo.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public void savePerson(Person person) {
        personMapper.insert(person);
    }

    @Override
    public void deletePerson(long id) {

    }

    @Override
    public Person getPerson(long id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public void updatePeron(Person person) {

    }

    @Override
    public List<Person> selectAll() {
        return personMapper.selectAll();
    }


}
