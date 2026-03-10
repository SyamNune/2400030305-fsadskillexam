package com.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fsad.exam.entity.Order;
import com.fsad.exam.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService service;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order) {
        return service.addOrder(order);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return service.getOrders();
    }
}