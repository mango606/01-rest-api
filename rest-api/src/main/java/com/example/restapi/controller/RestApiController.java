package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    // http://localhost:8080/api/echo/steve/age/20/is-man/true
    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")  // 주소는 대문자를 사용하지 않음.
    public String echo(
            @PathVariable String message,    // => PathVariable(name = "message") 를 사용하면 변수명이 message가 아니어도 매칭됨.
            @PathVariable int age,      // Integer는  null이 할당됨, int 타입은 null이 할당될 수 없고, 0이 default 값임.
            @PathVariable boolean isMan
    ) {
        System.out.println("echo message: " + message);
        System.out.println("echo age: " + age);
        System.out.println("echo isMan: " + isMan);

        // TODO: 대문자로 변환해서 Return => toUpperCase 메소드

        // TODO: String 타입의 변수 외에 다른 타입 받아보기

        // TODO: boolean, integer

        return message.toUpperCase();
    }

    // queryParam: 수동으로 파싱하는 방법
    // 주소를 대문자로 쓰는 게 반드시 그렇게 해야하는 것은 아님.
    // http://localhost:8080/api/book?category=IT&issuedYeer=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYeer,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued-day") String issuedDay
    ) {
        System.out.println(category);
        System.out.println(issuedYeer);
        System.out.println(issuedMonth);
        System.out.println(issuedDay);
    }

    // queryParam: 객체로 받는 방법
    // http://localhost:8080/api/book2?category=IT&issuedYeer=2023&issuedMonth=01&issuedDay=31
    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam BookQueryParam
    ) {
        System.out.println(BookQueryParam);
    }

    // TODO: Parameter 2가지 받기. int 타입으로 받아서 두 수의 덧셈, 곱셈
    // TODO: String 타입, boolean 타입도 받아보기
}
