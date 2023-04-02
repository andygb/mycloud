package com.rick.feign;

import com.rick.model.outter.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shishaofei
 * @since 2023/4/3
 */
@FeignClient("userService")
public interface UserFeignClient {

    @GetMapping("/users/{userId}")
    User queryByUserId(@PathVariable("userId") Integer userId);
}
