package com.dgsw.springmain.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long id);
}
