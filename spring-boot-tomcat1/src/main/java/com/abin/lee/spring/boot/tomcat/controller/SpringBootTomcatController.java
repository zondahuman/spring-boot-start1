package com.abin.lee.spring.boot.tomcat.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abin on 2016/12/12 13:23.
 * spring-boot-start1
 * com.abin.lee.spring.boot.tomcat
 */
@RestController
@RequestMapping("/universal")
public class SpringBootTomcatController {


    /**
     *   http://localhost:7600/universal/1
     *
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public String view(@PathVariable("id") Long id) {
        String result = id + " = No";
        return result;
    }




}
