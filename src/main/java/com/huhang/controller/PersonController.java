package com.huhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    @RequestMapping("/say")
    public String say(){
        return "success";
    }
}
