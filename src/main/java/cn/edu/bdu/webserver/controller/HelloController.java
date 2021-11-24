package cn.edu.bdu.webserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
