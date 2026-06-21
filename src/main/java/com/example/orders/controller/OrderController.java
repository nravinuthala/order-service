package com.example.orders.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public Map<String, Object> createOrder(@RequestBody Map<String, Object> request) throws Exception {
        if (new Random().nextInt(10) < 2) {
            throw new RuntimeException("Simulated failure");
        }

        Map<String, Object> response = new HashMap<>();
        response.put("orderId", UUID.randomUUID().toString());
        response.put("status", "CREATED");
        return response;
    }
}
