package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.example.app"})
public class Application {
    public static void main (String[] args){
        SpringApplication springApplication = new SpringApplication(Application.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
