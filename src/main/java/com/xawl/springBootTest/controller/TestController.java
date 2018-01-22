package com.xawl.springBootTest.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController()
@RequestMapping("/testController")
public class TestController {
    //    @Value("${name}")
//    String name;
//    @Value("${content}")
//    String content;
    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("helloWorld");
    }
}
