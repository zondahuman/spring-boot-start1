package com.abin.lee.spring.boot.tomcat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by abin on 2016/12/12 13:14.
 * spring-boot-start1
 * com.abin.lee.spring.boot.tomcat
 */
@SpringBootApplication
public class SpringBootTomcatApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootTomcatApplication.class);
    }

    public static void main(String[] args) {

    }
}
