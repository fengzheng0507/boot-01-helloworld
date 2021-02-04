package com.atguigu.boot.config;

import com.atguigu.boot.bean.Car;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Car.class) //Car 类上就不能再标注了，否则就会注册2个Bean对象
public class MyConfig {
}
