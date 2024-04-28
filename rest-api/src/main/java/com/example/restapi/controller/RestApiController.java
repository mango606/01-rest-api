package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}")
    public String echo(
            @PathVariable String message    // PathVariable(name = "message") 를 사용하면 변수명이 message가 아니어도 매칭됨.
    ) {
        System.out.println("echo message: " + message);

        // TODO: 대문자로 변환해서 Return

        // String 타입의 변수 외에 다른 타입 받아보기

        // boolean, integer

        return message;
    }
}
