package com.atguigu.boot.controller;


import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//不是跳转页面，而是直接写给浏览器，如果不加@ResponseBody，那么就会跳转页面
// @Controller
//@ResponseBody
public class HelloController {

    @GetMapping("/hello1111")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println(name);
        return "hashCode";
    }

    @RequestMapping("/hello1")
    public String handle01(){
        return "Hello,SpringBoot01" + "你好";
    }

    @Autowired
    Car car;


    @RequestMapping("/mycar")
    public Car mappingcar(){
        return car;
    }
}
