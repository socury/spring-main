package com.dgsw.springmain.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
