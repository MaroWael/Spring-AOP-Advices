package com.learn;

import com.learn.services.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var paymentService = context.getBean("paymentService", PaymentService.class);
        String result = paymentService.processPayment("Alice", 150.00);
        System.out.println("🟢 [RESULT] " + result);
        context.close();
    }
}
