package com.dgsw.springmain.order;

import com.dgsw.springmain.discount.DiscountPolicy;
import com.dgsw.springmain.discount.FixDiscountPolicy;
import com.dgsw.springmain.member.Member;
import com.dgsw.springmain.member.MemberRepository;
import com.dgsw.springmain.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
