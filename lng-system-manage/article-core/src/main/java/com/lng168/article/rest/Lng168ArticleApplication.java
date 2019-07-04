package com.lng168.article.rest;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.lng168.article"})
@EnableDubboConfiguration
public class Lng168ArticleApplication {

    public static void main(String[] args) {

        SpringApplication.run(Lng168ArticleApplication.class, args);
    }
}
