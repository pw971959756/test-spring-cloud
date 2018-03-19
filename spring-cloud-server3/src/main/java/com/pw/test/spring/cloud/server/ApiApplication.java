package com.pw.test.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by pengwei
 * 2018/3/19.
 */


@EnableEurekaServer
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
//        new SpringApplicationBuilder(ApiApplication.class).web(true).run(args);

    }


}
