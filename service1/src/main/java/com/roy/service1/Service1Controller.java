package com.roy.service1;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("api/service1")
public class Service1Controller{

    @Resource
    private DiscoveryClient client;

    @RequestMapping("add")
    public Integer add(Integer a,Integer b){

        return  a+b;
    }
}
