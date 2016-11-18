package com.example.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by paul on 16/11/18.
 */
@Component
public class Sender {

    @Autowired
    AmqpTemplate rabbitTemplate;



    public void send(){
        String context = "hello "+new Date();
        System.out.println("Sender:"+context);
        rabbitTemplate.convertAndSend("hello",context);
    }
}
