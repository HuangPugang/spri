package com.example.dao;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by paul on 16/12/5.
 */
@Repository
public class UserDao {


    @Autowired
    UserMapper userMapper;


    @Transactional
    public int insert(User user) {
        return userMapper.insert(user);

    }

    public List<User> findAll() {
        return userMapper.findAll();
    }


}
