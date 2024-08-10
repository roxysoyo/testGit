package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * UserController
 * @author HZQ
 * @version 1.0.0
 * <>
 * 2024/8/10 下午3:17
 */
@RestController
public class UserController {
    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello");
    }
}
