package com.rick.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Data
@TableName("orders")
public class Order {

    private Integer id;

    private String orderNumber;

    private Integer userId;

    private String userName;

    private BigDecimal price;

    private LocalDateTime orderTime;

    private Boolean valid;
}
