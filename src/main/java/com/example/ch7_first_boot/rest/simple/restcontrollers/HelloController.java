package com.example.ch7_first_boot.rest.simple.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//1 case @Controller And @ResponseBody
//@Controller
//public class HelloController {
//
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello!";
//    }
//    @GetMapping("/goodbye")
//    @ResponseBody
//    public String goodbye(){
//        return "Goodbye!";
//    }
//}


//2 case @RestController
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
    @GetMapping("/goodbye")
    public String goodbye(){
        return "Goodbye!";
    }
}
