package com.dgsw.springmain;

import com.dgsw.springmain.member.Grade;
import com.dgsw.springmain.member.Member;
import com.dgsw.springmain.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("New member joined: " + member.getName());
        System.out.println("Found member: " + findMember.getName());
    }
}
