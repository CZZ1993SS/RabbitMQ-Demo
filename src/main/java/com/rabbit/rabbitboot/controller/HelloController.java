package com.rabbit.rabbitboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

    @Value("${spring.rabbitmq.host}")
    private String addresses;

    @RequestMapping("index")
    private String index(){

        System.out.println(addresses);

        return "hello";
    }


}