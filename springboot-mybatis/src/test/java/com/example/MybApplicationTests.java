package com.example;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	public void contextLoads() {

		List<User> users = userMapper.findAll();
		System.out.println(users.toString());
	}

}
