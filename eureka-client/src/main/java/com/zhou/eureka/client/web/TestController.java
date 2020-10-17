package com.zhou.eureka.client.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/get")
    public  String get(){
        return  "docker-compose部署测试";
    }



}
