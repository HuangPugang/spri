package com.example.service;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.domain.UserBook;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by paul on 16/11/11.
 */
@Service
public class UserService {


    @Autowired
    UserDao userDao;


    @Transactional
    public int insert(User user) {
        return userDao.insert(user);

    }

    public List<User> findAll() {
        return userDao.findAll();
    }


}
