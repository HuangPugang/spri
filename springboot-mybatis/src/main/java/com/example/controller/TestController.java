package com.example.controller;

import com.example.business.UserBusiness;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * Created by paul on 16/11/18.
 */
@RestController
@RequestMapping("/test")
public class TestController {


    UserService userService;
    @Autowired
    UserBusiness business;

    @RequestMapping("/insert")
    public String test() {
//        business.testTransitional();
//        if (true)
//            throw new RuntimeException();

        Random random = new Random(1000);
        int i = userService.insert(new User(random.nextInt(), "huang" + random.nextInt(), "h9911" + random.nextInt(), random.nextInt()));
        return i + "haha";
    }


    @RequestMapping("/find")
    public List<User> find() {
//        business.testTransitional();
//        if (true)
//            throw new RuntimeException();

        Random random = new Random(1000);
        List<User> list = userService.findAll();
        return list == null ? null : list;
    }

}
