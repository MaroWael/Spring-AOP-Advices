package com.learn.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public String processPayment(String user, double amount) {
        System.out.println("💰 [BUSINESS] Processing payment logic...");
        return "Payment of $" + amount + " processed for " + user;
//        throw new RuntimeException("Simulated payment processing error");
    }
}
