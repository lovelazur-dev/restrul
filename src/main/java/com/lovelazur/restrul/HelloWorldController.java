package com.lovelazur.restrul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path="/hello-world")
    public String getHelloWorld(){
        return "Hello World !!";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean getHelloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }

    //path variable test
    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    //public HelloWorldBean getHelloWorldBean(@PathVariable(value="name") String name){
    public HelloWorldBean getHelloWorldBean(@PathVariable String name){

        //return new HelloWorldBean("Hello World Bean" + name);
        return new HelloWorldBean (String.format ("Hello World, %s", name) );
    }


}
