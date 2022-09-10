package com.craig.allpaprojecteurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AllpaProjectEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllpaProjectEurekaServiceApplication.class, args);
    }

}
