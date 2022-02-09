package realbasic.core.order;

import realbasic.core.discount.DiscountPolicy;
import realbasic.core.discount.FixDiscountPolicy;
import realbasic.core.member.Member;
import realbasic.core.member.MemberRepository;
import realbasic.core.member.MemoryMemberRepository;

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
