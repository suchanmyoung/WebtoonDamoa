package com.suchan.webtoondamoa.memberRepository;

import com.suchan.webtoondamoa.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class MemberRepositoryImplTest {

    private MemberRepository memberRepository = new MemberRepositoryImpl();

    @AfterEach
    void after(){
        memberRepository.clear();
    }

    @Test
    void save(){
        //given
        Member member1 = new Member("member1", "pw1", "member1", "email1");

        //when
        memberRepository.save(member1);

        //then
        Assertions.assertThat(member1).isEqualTo(member1);
    }

    @Test
    void findByName(){
        //given
        Member member1 = new Member("member1", "pw1", "member1", "email1");
        Member member2 = new Member("member2", "pw2", "member2", "email2");
        Member member3 = new Member("member3", "pw3", "member3", "email3");

        //when
        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);
        Optional<Member> memberFindByName = memberRepository.findByName("member1");

        //then
        Assertions.assertThat(memberFindByName.get().getLoginId()).isEqualTo(member1.getLoginId());
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("member1", "pw1", "member1", "email1");
        Member member2 = new Member("member2", "pw2", "member2", "email2");
        Member member3 = new Member("member3", "pw3", "member3", "email3");

        //when
        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);
        List<Member> all = memberRepository.findAll();

        //then
        Assertions.assertThat(all.size()).isSameAs(3);
    }
}