package com.lovelazur.restrul.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {
    @GetMapping("/hello2")
    public String hello(){
        return "hello";
    }
}
