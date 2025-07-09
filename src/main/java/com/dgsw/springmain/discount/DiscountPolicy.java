package com.dgsw.springmain.discount;

import com.dgsw.springmain.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);


}
