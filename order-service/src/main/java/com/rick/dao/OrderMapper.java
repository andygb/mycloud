package com.rick.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rick.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    @Select("<script>" +
            " SELECT * FROM orders WHERE user_id = #{userId} AND valid = 1 " +
            "</script>")
    List<Order> queryByUserId(@Param("userId") Integer userId);

}
