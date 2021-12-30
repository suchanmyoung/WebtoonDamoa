package com.suchan.webtoondamoa.service.memberService;

import com.suchan.webtoondamoa.domain.Member;
import com.suchan.webtoondamoa.memberRepository.MemberRepository;
import com.suchan.webtoondamoa.memberRepository.MemoryMemberRepository;

import java.util.Optional;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(String id) {
        return memberRepository.findById(id);
    }
}
