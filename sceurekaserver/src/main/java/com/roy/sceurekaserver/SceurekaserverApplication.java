package com.roy.sceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class SceurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SceurekaserverApplication.class, args);
    }

}

