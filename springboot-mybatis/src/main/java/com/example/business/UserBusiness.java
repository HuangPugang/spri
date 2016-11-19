package com.example.business;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

/**
 * Created by paul on 16/11/18.
 */
@Component
public class UserBusiness {

    @Autowired
    UserService userService;

    @Transactional
    public void testTransitional() {
        Random random = new Random();
        User user = new User();
        User user2 = new User();
        user.setId(random.nextInt(10000));
        user.setAge(random.nextInt());
        user.setEmail("htt0");
        user.setName("haha");

        userService.insert(user);
//        userService.insert(user2);
        List<User> users = userService.findAll();
        System.out.println(users.toString());
    }
}
