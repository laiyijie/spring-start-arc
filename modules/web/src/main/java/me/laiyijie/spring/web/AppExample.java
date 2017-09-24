package me.laiyijie.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/9/24.
 */
@SpringBootApplication
@RestController
public class AppExample {

    @RequestMapping("/")
    public String tee(){
        return "hello spring boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppExample.class, args);
    }
}
