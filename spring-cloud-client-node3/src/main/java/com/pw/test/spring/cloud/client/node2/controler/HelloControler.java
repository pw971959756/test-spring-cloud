package com.pw.test.spring.cloud.client.node2.controler;

import com.pw.test.spring.cloud.client.node2.service.Node1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pengwei
 * 2018/3/19.
 */
@RestController
public class HelloControler {


    @Autowired
    Node1Service node1Service;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name, HttpServletRequest request){
        System.out.print("client-node3 -> EurekaClientNode2Application -> hi ->" + name);
        System.out.println("\t IP:" + request.getRemoteAddr());
        return node1Service.hiService(name);
    }

}
