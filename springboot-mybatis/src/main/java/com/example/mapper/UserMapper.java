package com.example.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by paul on 16/11/9.
 */
@Mapper
public interface UserMapper {

    List<User> findAll();
}
