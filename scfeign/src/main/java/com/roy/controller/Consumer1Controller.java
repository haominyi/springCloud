package com.roy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("scfeign_consumer1")
public class Consumer1Controller {
    @Resource
    public Service1Controller service1Controller;

    @RequestMapping("add")
    public Integer add(){
        return service1Controller.add(20,80);
    }
}
