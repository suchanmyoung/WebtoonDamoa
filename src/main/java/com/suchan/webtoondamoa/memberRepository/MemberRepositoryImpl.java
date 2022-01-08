package com.suchan.webtoondamoa.memberRepository;

import com.suchan.webtoondamoa.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemberRepositoryImpl implements MemberRepository{

private static Map<String, Member> memberStore = new HashMap();


    @Override
    public void save(Member member) {
        memberStore.put(member.getId(), member);
    }

    @Override
    public Member findById(String id) {
        return memberStore.get(id);
    }

    @Override
    public Optional<Member> findByName(String name) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
