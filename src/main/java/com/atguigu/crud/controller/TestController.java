package com.atguigu.crud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @RequestMapping("/login")
    public String login(HttpSession session){
        session.setAttribute("hello",1);
        return "login";
    }
}
