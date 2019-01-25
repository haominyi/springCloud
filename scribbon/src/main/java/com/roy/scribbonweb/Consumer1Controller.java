package com.roy.scribbonweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Consumer1Controller {
    @Resource
    RestTemplate restTemplate;

    @RequestMapping("add")
    public String add(){
        return restTemplate.getForEntity("http://service1/api/service1/add?a=10&b=20",String.class).getBody();
    }

}
