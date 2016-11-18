package com.example.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by paul on 16/11/18.
 */
@Component
public class Sender {

    @Autowired
    RabbitTemplate rabbitTemplate;



    public void send(){
        String context = "hello "+new Date();
        System.out.println("Sender:"+context);
        rabbitTemplate.convertAndSend("hello",context);
    }

    public void sendTest(){
        rabbitTemplate.convertAndSend("topic_bike","bike.haha","我是测试测试");
    }
}
