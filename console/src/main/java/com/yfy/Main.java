package com.yfy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
    }
}
