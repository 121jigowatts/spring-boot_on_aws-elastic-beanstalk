package com.jigowatts.springboot_on_awselasticbeanstalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(value="/")
    public String index() {
        return "Hello AWS Elastic Beanstalk!";
    }
}