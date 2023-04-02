package com.rick.web;

import com.rick.model.User;
import com.rick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@RestController
public class UserCtrl {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> queryAll() {

        System.out.println("AAAA   QQQQQQQ AAAAA");
        System.out.println(234);
        return userService.queryAll();
    }

    @GetMapping("/users/{userId}")
    public User queryById(@PathVariable("userId") Integer userId) {
        System.out.println("############## BEGIN ##################");
        System.out.println("someone call queryById userId : " + userId);
        System.out.println("############## END ##################");
        return userService.queryById(userId);
    }

    @PostMapping("/users/add")
    public Boolean addUser(@RequestBody User user) {
        System.out.println("JVM running for AAA");
        System.out.println(user);
        return userService.addUser(user);
    }
}
