package com.enexse.intranet.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EesMsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EesMsEurekaServerApplication.class, args);
    }

}
