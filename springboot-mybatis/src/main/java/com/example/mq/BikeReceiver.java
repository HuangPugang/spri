package com.example.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 16/11/18.
 */
@Component
public class BikeReceiver {

    @RabbitListener(queues = "bike.test")
    public void receive(String msg) {

        System.out.println(msg);
    }

}
