package com.pw.test.spring.cloud.client.node1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pengwei
 * 2018/3/19.
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientNode1Application {


    @Value("${server.port}")
    String port;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientNode1Application.class, args);
    }


    @RequestMapping("/hi")
    public String home(@RequestParam String name, HttpServletRequest request) {
        System.out.print("client-node1 -> EurekaClientNode1Application -> home ->" + name);
        System.out.println("\t IP:" + request.getRemoteAddr());
        return "hi " + name + ",i am from port:" + port;
    }
}
