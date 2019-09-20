package com.qs.web.controller;

import com.qs.dao.UserDao;
import com.qs.javabean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserDao dao;

    @RequestMapping(value= "service/{id}", produces = {"application/json;charset=utf-8"})
    public User findById(@PathVariable int id){
        System.out.println(id);
        return dao.findById(id);
    }
}
