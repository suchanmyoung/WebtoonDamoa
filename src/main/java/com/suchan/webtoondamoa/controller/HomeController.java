package com.suchan.webtoondamoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        Date now = new Date();
        String nowDate = now.toString();
        model.addAttribute("nowDate", nowDate);
        return "home";
    }
}
