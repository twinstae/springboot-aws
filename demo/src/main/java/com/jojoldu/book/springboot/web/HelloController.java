package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>hello</h1><p>나는 귀여운 토끼의 서버야!</p>";
    }

    @GetMapping("/bye")
    public String bye() {
        return "goodbye mimik";
    }
}