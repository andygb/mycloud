package com.rick.web;

import com.rick.model.Order;
import com.rick.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@RestController
public class OrderCtrl {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/users/{userId}")
    public List<Order> queryByUserId(@PathVariable("userId") Integer userId) {
        return orderService.queryOrdersByUserId(userId);
    }
}
