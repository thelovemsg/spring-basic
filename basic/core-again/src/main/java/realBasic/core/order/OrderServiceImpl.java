package realBasic.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import realBasic.core.discount.DiscountPolicy;
import realBasic.core.member.Member;
import realBasic.core.member.MemberRepository;

@Component
public class OrderServiceImpl implements OrderService{

//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //OrderServiceImpl이 RateDiscountPolicy와 FixDiscountPolicy 둘 다 의존해고 있음
    //=> 그러니 무언가를 수정하려면 어찌되었든 직접 코드를 내부에서 수정해야 한다.
    //그러자니 OCP를 위배한다.
    //또한, 인터페이스 뿐만 아니라 구체 클래스에도 의존하니 DIP 위반

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
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
