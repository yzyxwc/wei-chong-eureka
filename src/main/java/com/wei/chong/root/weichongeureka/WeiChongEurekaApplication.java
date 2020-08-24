package com.wei.chong.root.weichongeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeiChongEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiChongEurekaApplication.class, args);
    }

}
