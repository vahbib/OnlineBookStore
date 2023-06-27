package com.bibs.onlineBookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bibs.onlineBookStore"})
public class OnlineBookStoreApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreApiApplication.class, args);
    }

}
