package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
// @Controller
@RequestMapping("/api/v1")
public class ResponseApiController {

    // http://localhost:8080/api/v1
    @GetMapping(path = "")  // api를 만들 것이기 때문에 RequestMapping 보다는 GetMapping 사용함.
    // @RequestMapping(path = "", method = RequestMethod.GET)
    // @ResponseBody   // @Controller일 때, 응답이 json으로 내려감. (=RestController)
    public ResponseEntity<UserRequest> user(){

        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail.com");

        log.info("user: {}", user);

//        var response = ResponseEntity
//                .status(HttpStatus.OK)    // 200
//                .body(user);

//        var response = ResponseEntity
//                .status(HttpStatus.CREATED) // 201
//                .body(user);

        // ResponseEntity는 예외가 발생했을 때, 응답 코드 내릴 때
        var response = ResponseEntity
            .status(HttpStatus.BAD_REQUEST) // 400
            .header("x-custom","hi")
            .body(user);

        return response;
    }
}

//@Slf4j
//@RestController
//@RequestMapping("/api/v1")
//public class ResponseApiController {
//
//    // http://localhost:8080/api/v1
//    @GetMapping(path = "")
//    public UserRequest user(){
//
//        var user = new UserRequest();
//        user.setUserName("홍길동");
//        user.setUserAge(10);
//        user.setEmail("hong@gmail.com");
//
//        log.info("user: {}", user);
//
//        return user;
//    }
//}