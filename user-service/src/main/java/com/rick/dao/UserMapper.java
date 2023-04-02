package com.rick.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rick.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
