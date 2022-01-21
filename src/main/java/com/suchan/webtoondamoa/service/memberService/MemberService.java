package com.suchan.webtoondamoa.service.memberService;

import com.suchan.webtoondamoa.domain.Member;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MemberService {

    void join(Member member);

    Member findByLoginId(String loginId);

}
