package com.geekbrains.spring.web.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.geekbrains")
public class MainServiceApplication {
    public static void main(String[] args) {SpringApplication.run(MainServiceApplication.class, args);}
}
