package com.rick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shishaofei
 * @since 2023/4/2
 */
@EnableDiscoveryClient
@SpringBootApplication
public class TradeApp {

    public static void main(String[] args) {
        SpringApplication.run(TradeApp.class);
    }


}
