package com.mysrx.llonsell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HelloController {
    @RequestMapping("/myhello")
    @ResponseBody
    public String sayhello()
    {
        System.out.println("hello");
        return "helllll999l";
    }
}
