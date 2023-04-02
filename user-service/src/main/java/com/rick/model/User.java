package com.rick.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@TableName(value = "users")
@Data
public class User {

    private Integer id;

    private String name;

    private BigDecimal score;

    private LocalDateTime birthday;

    private String email;

}
