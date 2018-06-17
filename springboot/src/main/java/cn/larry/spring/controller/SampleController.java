package cn.larry.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import my.MyDemo;

@Controller
@EnableAutoConfiguration
@ImportResource("classpath:NewFile.xml")
public class SampleController {
	@Autowired MyDemo my;
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	my.sayHello();
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}