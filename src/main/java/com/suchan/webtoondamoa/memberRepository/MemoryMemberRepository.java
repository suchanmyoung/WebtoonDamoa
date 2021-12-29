package com.suchan.webtoondamoa.memberRepository;

import com.suchan.webtoondamoa.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryMemberRepository  implements MemberRepository{

    @Override
    public Member save(Member member) {
        List<Member> members = new ArrayList<>();
        members.add(member);
        for(int i=0; i<members.size(); i++) {
            System.out.println("새 멤버는 + " + members.get(i).getName() + "입니다.");
        }
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return null;
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
