package com.qs.service.impl;

import com.qs.dao.UserDao;
import com.qs.javabean.User;
import com.qs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public User findById(Serializable id) {
        System.out.println(dao);
        return dao.findById(id);
    }


}
