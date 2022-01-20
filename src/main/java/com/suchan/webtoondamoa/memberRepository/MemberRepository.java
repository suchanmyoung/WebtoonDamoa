package com.suchan.webtoondamoa.memberRepository;

import com.suchan.webtoondamoa.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {

    void save(Member member);
    Member findById(Long id);
    Member findByLoginId(String id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
    void clear();
}
