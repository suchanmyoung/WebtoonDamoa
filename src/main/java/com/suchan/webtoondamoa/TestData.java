package com.suchan.webtoondamoa;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestData {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init(){
        Member member1 = new Member("test1", "test1!", "테스트계정1", "테스트이메일1@naver.com");
        Member member2 = new Member("test2", "test2!", "테스트계정2", "테스트이메일2@naver.com");
        Member member3 = new Member("test3", "test3!", "테스트계정3", "테스트이메일3@naver.com");

        System.out.println("생성되었습니다");
        System.out.println("생성되었습니다");
        System.out.println("생성되었습니다");

        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);
    }

}
