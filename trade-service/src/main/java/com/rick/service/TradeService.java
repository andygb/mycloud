package com.rick.service;

import com.rick.model.UserWithOrderVO;
import com.rick.model.outter.User;
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
public class TradeService {

    @Autowired
    private RestTemplate restTemplate;

    public List<UserWithOrderVO> queryUseOrders(Integer userId) {
        ResponseEntity<User> entity = restTemplate.getForEntity("http://localhost:8081/users/" + userId, User.class);
        User user = entity.getBody();

        return Collections.emptyList();
    }

    public User queryUserByUserId(Integer userId) {
        ResponseEntity<User> entity = restTemplate.getForEntity("http://userService/users/" + userId, User.class);

//        ResponseEntity<User> entity = restTemplate.getForEntity("http://localhost:8081/users/" + userId, User.class);
        System.out.println("queryUserByUserId result : " + entity.toString());
        User user = entity.getBody();
        return user;
    }

}
