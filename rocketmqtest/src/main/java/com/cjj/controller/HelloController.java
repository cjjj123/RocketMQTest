package com.cjj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2020/9/2.
 */
@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
