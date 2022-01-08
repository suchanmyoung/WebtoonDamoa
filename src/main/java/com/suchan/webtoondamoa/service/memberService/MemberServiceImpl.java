package com.suchan.webtoondamoa.service.memberService;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import com.suchan.webtoondamoa.memberRepository.MemberRepositoryImpl;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemberRepositoryImpl();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(String id) {
        return memberRepository.findById(id);
    }
}
