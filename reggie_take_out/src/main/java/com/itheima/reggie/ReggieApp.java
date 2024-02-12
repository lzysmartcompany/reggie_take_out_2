package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ReggieApp {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApp.class,args);
        log.info("ReggieApp启动了");
    }
}
