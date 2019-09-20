package com.qs.service;

import com.qs.javabean.User;

import java.io.Serializable;

public interface UserService {
    User findById(Serializable id);

}
