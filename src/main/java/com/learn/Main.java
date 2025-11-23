package com.learn;

import com.learn.services.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var cxt = new AnnotationConfigApplicationContext(AppConfig.class);
        var orderService = cxt.getBean("orderService", OrderService.class);
        String s = orderService.placeOrder("Book");
        System.out.println(s);
        cxt.close();
    }
}
