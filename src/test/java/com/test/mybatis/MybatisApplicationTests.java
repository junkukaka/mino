package com.test.mybatis;

import com.test.mybatis.curd.service.PersonService;
import com.test.mybatis.curd.service.UserHobbyService;
import com.test.mybatis.curd.service.UserService;
import com.test.mybatis.pojo.Person;
import com.test.mybatis.pojo.User;
import com.test.mybatis.pojo.UserHobby;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Resource
    PersonService personService;

    @Resource
    UserService userService;

    @Resource
    UserHobbyService userHobbyService;


    @Test
    void contextLoads() {
        Person person = new Person();
        person.setAge(12);
        person.setName("patrick");
        person.setId(1L);

        personService.savePerson(person);
    }

    @Test
    void testAutoIdAndDeleted(){
        User user = new User();
        user.setAge(12);
        user.setEmail("name@at.com");
        user.setName("patrick");
        userService.saveUser(user);
    }

    @Test
    void testSelect(){
        User user = userService.getUser(1l);
        System.out.println(user.toString());

        List<User> all = userService.getAll();
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).getEmail());
        }

        List<Person> personList = personService.selectAll();
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }
    }

    @Test
    void userHobbyTest(){
        UserHobby userHobby = new UserHobby();
        userHobby.setUserId(3l);
        userHobby.setHobbyName("123123123");
        userHobbyService.saveUserHobby(userHobby);
    }





}
