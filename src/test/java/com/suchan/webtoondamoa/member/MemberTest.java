package com.suchan.webtoondamoa.member;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import com.suchan.webtoondamoa.service.memberService.MemberService;
import com.suchan.webtoondamoa.service.memberService.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class MemberTest {

    @Autowired
    MemberService memberService;

    @Test
    void join(){
        //given
        Member member = new Member("audtncks2", "de741852", "수찬", "aud248@naver.com");

        //when
        memberService.join(member);
        Member findMember = memberService.findByLoginId("audtncks2");

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }

}
