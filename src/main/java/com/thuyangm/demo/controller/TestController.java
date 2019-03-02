package com.thuyangm.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/index.do")
    public String testindex(){
        System.out.println("TestController>>>test>>>is running....return a string");
        return "index";//返回一个视图
    }
}
