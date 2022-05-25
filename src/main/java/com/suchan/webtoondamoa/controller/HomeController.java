package com.suchan.webtoondamoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/api/hello")
    public String helloWorld(){
        return "hello!";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about.html")
    public String about() {
        return "about";
    }

    @RequestMapping("/index.html")
    public String home() {
        return "index";
    }

    @RequestMapping("/board.html")
    public String board() {
        return "board";
    }

}
