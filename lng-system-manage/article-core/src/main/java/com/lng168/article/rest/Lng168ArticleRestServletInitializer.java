package com.lng168.article.rest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Guns REST Web程序启动类
 *
 * @author fengshuonan
 * @date 2017年9月29日09:00:42
 */
public class Lng168ArticleRestServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Lng168ArticleApplication.class);
    }

}
