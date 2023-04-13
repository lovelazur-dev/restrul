package com.lovelazur.restrul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path="/hello-world")
    public String getHelloWorld(){
        return "Hello World !!";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean2 getHelloWorldBean(){
        return new HelloWorldBean2("Hello World Bean");
    }



}
