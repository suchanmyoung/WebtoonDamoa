package com.suchan.webtoondamoa.member;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.service.memberService.MemberService;
import com.suchan.webtoondamoa.service.memberService.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class MemberTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member = new Member("audtncks2", "de741852", "수찬", "aud248@naver.com");

        //when
        memberService.join(member);
        Member findMember = memberService.findById(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }

}
