package com.pw.test.spring.cloud.client.node2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pengwei
 * 2018/3/19.
 */
@Service
public class Node1Service {

    @Autowired
    private RestTemplate restTemplate;


    public String hiService(String name) {
        return restTemplate.getForObject("http://client-node1/hi?name="+name,String.class);
    }
}
