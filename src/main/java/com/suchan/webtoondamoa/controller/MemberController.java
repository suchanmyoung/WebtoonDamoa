package com.suchan.webtoondamoa.controller;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import com.suchan.webtoondamoa.service.memberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {


    @Autowired
    public MemberController(MemberRepository memberRepository, MemberService memberService){
        this.memberRepository=memberRepository;
        this.memberService=memberService;
    }

    private final MemberRepository memberRepository;
    private final MemberService memberService;


    @RequestMapping("/signup.html")
    public String signUp(){
        return "signup";
    }


    @PostMapping("/members/new")
    public String create(Member signup){
        memberService.join(signup);
        return "redirect:/";
    }

    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
}
