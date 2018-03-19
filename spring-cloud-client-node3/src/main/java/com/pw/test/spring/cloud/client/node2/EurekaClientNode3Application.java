package com.pw.test.spring.cloud.client.node2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pengwei
 * 2018/3/19.
 */
@EnableHystrix                      //路由断点
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientNode3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientNode3Application.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
