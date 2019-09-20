package com.qs.dao;

import com.qs.javabean.User;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

@Mapper
public interface UserDao {
    User findById(Serializable id);
}
