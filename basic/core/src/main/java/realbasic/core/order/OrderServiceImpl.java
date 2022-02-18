package realbasic.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import realbasic.core.annotation.MainDiscountPolicy;
import realbasic.core.discount.DiscountPolicy;
import realbasic.core.member.Member;
import realbasic.core.member.MemberRepository;

@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private final DiscountPolicy discountPolicy;

    //필드 주입 @Autowired private final DiscountPolicy discountPolicy;
    //필드 주입 @Autowired private final MemberRepository memberRepository;
    //필드 주입을 하다보면 변경이 불가능해서 테스트 하기 힘들다.

    //생성자가 딱 하나만 있다면 @Autowired를 지정해주지 않아도 자동으로 붙여있는것과 똑같다.

//    @Autowired
//    public void init(MemberRepository memberRepository, DiscountPolicy discountPolicy){
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy rateDiscountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = rateDiscountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
