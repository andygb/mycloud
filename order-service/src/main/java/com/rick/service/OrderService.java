package com.rick.service;

import com.rick.dao.OrderMapper;
import com.rick.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> queryOrdersByUserId(Integer userId) {
        return orderMapper.queryByUserId(userId);
    }
}
