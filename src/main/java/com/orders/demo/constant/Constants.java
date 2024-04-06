package com.orders.demo.constant;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String QUEUE = "orders_queue";
    public static final String EXCHANGE = "orders_exchange";
    public static final String ROUTING_KEY = "orders_routing_exchange";
}
