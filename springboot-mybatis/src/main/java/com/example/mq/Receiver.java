package com.example.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**`
 * Created by paul on 16/11/18.
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {


    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver:" + hello);
    }

}
