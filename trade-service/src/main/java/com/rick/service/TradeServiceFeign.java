package com.rick.service;

import com.rick.feign.UserFeignClient;
import com.rick.model.UserWithOrderVO;
import com.rick.model.outter.User;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Service
public class TradeServiceFeign {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;

    public List<UserWithOrderVO> queryUseOrders(Integer userId) {
//        ResponseEntity<User> entity = userFeignClient.getForEntity("http://localhost:8081/users/" + userId, User.class);
//        User user = entity.getBody();

        return Collections.emptyList();
    }

    public User queryUserByUserId(Integer userId) {
        User user = userFeignClient.queryByUserId(userId);
        System.out.println("feign queryUserByUserId result : " + user.toString());
        return user;
    }

}
