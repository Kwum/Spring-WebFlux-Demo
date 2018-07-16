package com.springboot.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Description: Hello控制层
 * @Author Kwum
 * @Date 2018-07-16 16:01
 */
@RestController
public class HelloController {

    //WebMVC命令式的样子
    @GetMapping("/helloMVC")
    public String helloMVC() {
        return "Welcome to MVC old world!";
    }

    //Mono响应式的样子
    @GetMapping("/helloMono")
    public Mono<String> helloMono() {
        return Mono.just("Welcome to Mono new world!");
    }
}
