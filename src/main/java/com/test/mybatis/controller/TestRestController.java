package com.test.mybatis.controller;

import com.test.mybatis.curd.service.UserService;
import com.test.mybatis.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class TestRestController {

    @Resource
    UserService userService;

    @GetMapping("/users/{id}")
    public @ResponseBody AjaxResponse getUserById(@PathVariable Long id){
        User user = userService.getUser(id);
        return AjaxResponse.success(user);
    }

    @PostMapping("/users")
    public @ResponseBody AjaxResponse saveUser(@RequestBody User s){
        userService.saveUser(s);
        return AjaxResponse.success();
    }

    @DeleteMapping("/users/{id}")
    public @ResponseBody AjaxResponse deleteById(@PathVariable Long id){
        userService.deleteById(id);
        return AjaxResponse.success();
    }
}

