package com.springboot.webflux.config;

import com.springboot.webflux.handler.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @Description: 路由器配置类
 * @Author Kwum
 * @Date 2018-07-16 17:01
 */
@Configuration
public class RouterConfig {

    @Autowired
    HelloHandler helloHandler;

    @Bean
    public RouterFunction<ServerResponse> helloRouter(){
        return route(GET("/time"), helloHandler::getTime);
    }
}
