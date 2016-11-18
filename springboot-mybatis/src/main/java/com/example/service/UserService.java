package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by paul on 16/11/11.
 */
@Service
@Transactional
public class UserService {


    @Autowired
    UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);

    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
