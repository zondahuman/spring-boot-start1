package com.abin.lee.spring.boot.swagger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by abin on 2016/12/13 13:26.
 * spring-boot-start1
 * com.abin.lee.spring.boot.swagger
 */
@SpringBootApplication
public class SpringBootSwaggerApplication {

    /**
     *
     * http://localhost:8080/swagger-ui.html 使用swagger2界面查看文档，以及测试用例测试
     *
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootSwaggerApplication.class).web(true).run(args);
    }


}
