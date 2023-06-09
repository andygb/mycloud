package com.rick.web;

import com.rick.model.UserWithOrderVO;
import com.rick.model.outter.User;
import com.rick.service.TradeService;
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
public class TradeCtrl {

    @Autowired
    private TradeService tradeService;


    @GetMapping("/users/{userId}/orders")
    public List<UserWithOrderVO> queryUserOrders(@PathVariable("userId") Integer userId) {
        return tradeService.queryUseOrders(userId);
    }

    @GetMapping("/users/{userId}")
    public User queryUserByUserId(@PathVariable("userId") Integer userId) {
        return tradeService.queryUserByUserId(userId);
    }

}
