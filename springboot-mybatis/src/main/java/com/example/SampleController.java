package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paul on 16/11/11.
 */
@RestController
@RequestMapping("/sample")
public class SampleController {



    @RequestMapping(value = "test")
    public String test(){
        return "test";
    }


}
