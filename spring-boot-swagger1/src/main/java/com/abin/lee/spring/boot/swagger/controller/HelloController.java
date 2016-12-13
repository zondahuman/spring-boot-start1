package com.abin.lee.spring.boot.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abin on 2016/12/13 13:28.
 * spring-boot-start1
 * com.abin.lee.spring.boot.swagger.controller
 */
@RestController
public class HelloController {

//    @ApiIgnore
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }

}
