package com.example.mapper;

import com.example.domain.User;
import com.example.domain.UserBook;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by paul on 16/11/9.
 */
public interface UserMapper {

    int insert(User user);
    List<User> findAll();

    List<UserBook> findUserBook();


}
