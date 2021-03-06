package com.suchan.webtoondamoa.controller;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import com.suchan.webtoondamoa.memberRepository.MemberRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestController(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    private MemberRepository memberRepository;

    @GetMapping("/test")
    public String testData(Model model){
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        return "test/test";
    }

}
