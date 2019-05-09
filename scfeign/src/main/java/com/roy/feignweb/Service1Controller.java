package com.roy.feignweb;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service1/api/service1")
public interface Service1Controller {
    @RequestMapping("add")
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
