package com.rick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */

@EnableEurekaServer
@SpringBootApplication
public class MyEurekaApp
{
    public static void main( String[] args )
    {
        System.out.println( "MyEurekaApp staring" );
        SpringApplication.run(MyEurekaApp.class);
    }
}
