package com.rick.service;

import com.rick.dao.UserMapper;
import com.rick.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.selectList(null);
    }

    public Boolean addUser(User user) {
        return userMapper.insert(user) > 0;
    }

    public User queryById(Integer id) {
        return userMapper.selectById(id);
    }
}
