package com.example.controller;

import com.example.business.UserBusiness;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    @Autowired
    UserBusiness business;
    @RequestMapping("/test")
    public String test() {
        business.testTransitional();

        return "haha";
    }


}
