package com;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testPackage {
    @RequestMapping("/hello1")
    public  String hello1(){
        return "hello1";
    }
}
