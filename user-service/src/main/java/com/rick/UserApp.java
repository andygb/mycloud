package com.rick;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Hello world!
 *
 */
//@EnableEurekaClient
@SpringBootApplication
public class UserApp
{
    public static void main( String[] args )
    {
        System.out.println( "UserApp starting" );
        SpringApplication.run(UserApp.class);
    }

}
