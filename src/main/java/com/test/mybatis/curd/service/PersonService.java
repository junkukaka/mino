package com.test.mybatis.curd.service;

import com.test.mybatis.pojo.Person;

import java.util.List;

public interface PersonService {
    void savePerson(Person person);
    void deletePerson(long id);
    Person getPerson(long id);
    List<Person> getAll();
    void updatePeron(Person person);
    List<Person> selectAll();
}
