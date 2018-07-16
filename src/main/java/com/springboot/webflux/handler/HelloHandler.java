package com.springboot.webflux.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description: Hello处理类
 * @Author Kwum
 * @Date 2018-07-16 16:39
 */
@Component
public class HelloHandler {

    /**
     * 获取当前时间
     * @param serverRequest
     * @return
     */
    public Mono<ServerResponse> getTime(ServerRequest serverRequest){
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(
                Mono.just(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))), String.class);
    }
}
