package com.orders.demo.publisher;

import com.orders.demo.dto.Order;
import com.orders.demo.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static com.orders.demo.constant.Constants.EXCHANGE;
import static com.orders.demo.constant.Constants.ROUTING_KEY;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    private final RabbitTemplate template;

    public OrderPublisher(RabbitTemplate template) {
        this.template = template;
    }

    @PostMapping("/{orderName}")
    public String order(@RequestBody Order order, @PathVariable String orderName) {
        order.setId(UUID.randomUUID().toString());
        String message = "Order places successfully for " + orderName;
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", message);
        template.convertAndSend(EXCHANGE, ROUTING_KEY, orderStatus);
        return "Success!";
    }

}
