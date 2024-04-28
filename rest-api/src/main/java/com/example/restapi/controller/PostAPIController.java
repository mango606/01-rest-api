package com.example.restapi.controller;

import com.example.restapi.model.BookRequest;
import com.example.restapi.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostAPIController {

    // http://localhost:8080/api/post
    @PostMapping("/post")
    public BookRequest post(
        @RequestBody BookRequest bookRequest
    ) {
        System.out.println(bookRequest);
        return bookRequest; // 객체를 기본적으로 json으로 변환해줌.
    }

    // RequestBody로 사용자의 이름, 전화번호, 이메일을 받는 POST Method 만들기 (User 클래스 생성, 주소 지정, 해당 데이터 받기)
    // http://localhost:8080/api/user
    @PostMapping("/user")
    public UserRequest Uesr(
            @RequestBody UserRequest userRequest
    ) {
        System.out.println(userRequest);
        return userRequest;
    }
}