package com.example.controller;

import com.example.business.UserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        if (true)
            throw new RuntimeException();
        return "haha";
    }


}
