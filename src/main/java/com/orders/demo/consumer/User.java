package com.orders.demo.consumer;

import com.orders.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.orders.demo.constant.Constants.QUEUE;

@Component
public class User {

    @RabbitListener(queues = QUEUE)
    public void consumeMessageFromQueue(OrderStatus status) {
        System.out.println("Message received to user from queue " + status);
    }

}
