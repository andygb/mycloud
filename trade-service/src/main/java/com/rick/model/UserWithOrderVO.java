package com.rick.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@Data
public class UserWithOrderVO {

    private Integer userId;

    private String userName;

    private String email;

    private Integer orderId;

    private String orderNumber;

    private BigDecimal price;


}
