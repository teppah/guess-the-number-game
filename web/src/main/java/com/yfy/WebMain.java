package com.yfy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.AbstractClientHttpResponse;
import org.springframework.http.client.ClientHttpRequestInterceptor;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@Slf4j
public class WebMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(WebMain.class, args);
        log.info("context initialized, ctx = {}", ctx);
    }
}
