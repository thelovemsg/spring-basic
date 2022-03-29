package realBasic.core.order;

import realBasic.core.member.Grade;
import realBasic.core.member.Member;
import realBasic.core.member.MemberService;
import realBasic.core.member.MemberServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order  = " + order);

    }

}
