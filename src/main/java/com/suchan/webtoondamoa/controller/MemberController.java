package com.suchan.webtoondamoa.controller;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import com.suchan.webtoondamoa.memberRepository.MemoryMemberRepository;
import com.suchan.webtoondamoa.memberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @Autowired
    public MemberController(MemoryMemberRepository memberRepository){this.memberRepository=memberRepository;}

    private final MemoryMemberRepository memberRepository;


    @RequestMapping("/signup.html")
    public String signUp(){
        return "signup";
    }


    @PostMapping("/members/new")
    public String create(Member signup){
        Member member = new Member();
        member.setId(signup.getId());
        member.setPw(signup.getPw());
        member.setName(signup.getName());
        member.setEmail(signup.getEmail());
        memberRepository.save(member);
        return "redirect:/";
    }

    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
}
