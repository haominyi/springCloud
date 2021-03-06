package com.roy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController("scfibbon_consumer1")
public class Consumer1Controller {
    @Resource
    RestTemplate restTemplate;

    @RequestMapping("add")
    public String add(){
        return restTemplate.getForEntity("http://service1/api/s1/add?a=10&b=20",String.class).getBody();
    }

}
