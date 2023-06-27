package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yuankai Yang
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    @Value("${server.port}")
    String port;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}