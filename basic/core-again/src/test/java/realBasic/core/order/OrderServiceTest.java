package realBasic.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import realBasic.core.AppConfig;
import realBasic.core.member.Grade;
import realBasic.core.member.Member;
import realBasic.core.member.MemberService;

class OrderServiceTest {

//    MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
//    OrderService orderService = new OrderServiceImpl(memberRepository, discountPolicy);
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}