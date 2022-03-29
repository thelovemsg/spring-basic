package realBasic.core.order;

import realBasic.core.discount.DiscountPolicy;
import realBasic.core.discount.FixDiscountPolicy;
import realBasic.core.member.Member;
import realBasic.core.member.MemberRepository;
import realBasic.core.member.MemoryMemberRepository;

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
