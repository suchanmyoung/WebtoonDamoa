package com.suchan.webtoondamoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HomeController {

//    @GetMapping("/")
//    public String index(Model model){
//        Date now = new Date();
//        String nowDate = now.toString();
//        model.addAttribute("nowDate", nowDate);
//        return "home";
//    }

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
