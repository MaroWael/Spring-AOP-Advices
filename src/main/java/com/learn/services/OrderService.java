package com.learn.services;

import com.learn.annotations.Loggable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Loggable
    public String placeOrder(String item) {
        System.out.println("Business logic running...");
        return "Order placed for " + item;
    }

    public void cancel() {
        System.out.println("Cancel logic running...");
    }
}
