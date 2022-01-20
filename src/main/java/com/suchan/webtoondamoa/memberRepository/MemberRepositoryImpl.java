package com.suchan.webtoondamoa.memberRepository;

import com.suchan.webtoondamoa.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private static Map<Long, Member> memberStoreId = new HashMap();
    private static Map<String, Member> memberStoreLoginId = new HashMap();
    private static Map<String, Member> memberStoreName = new HashMap();
    private static Long sequence = 0L;

    @Override
    public void save(Member member) {
        member.setId(++sequence);
        memberStoreId.put(member.getId(), member);
        memberStoreLoginId.put(member.getLoginId(), member);
        memberStoreName.put(member.getName(), member);
    }

    @Override
    public Member findById(Long id) {
        return memberStoreId.get(id);
    }

    @Override
    public Member findByLoginId(String id) {
        return memberStoreLoginId.get(id);
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.ofNullable(memberStoreName.get(name));
    }

    @Override
    public List<Member> findAll() {
        List<Member> allMember = new ArrayList<>(memberStoreId.values());

        for (Member a : allMember) {
            System.out.println(allMember);
            return allMember;
        }
        return null;
    }

        @Override
        public void clear () {
            memberStoreId.clear();
            memberStoreName.clear();
            memberStoreLoginId.clear();
        }
    }
