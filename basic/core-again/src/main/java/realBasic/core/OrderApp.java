package realBasic.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import realBasic.core.member.Grade;
import realBasic.core.member.Member;
import realBasic.core.member.MemberService;
import realBasic.core.member.MemberServiceImpl;
import realBasic.core.order.Order;
import realBasic.core.order.OrderService;
import realBasic.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();
//
//        MemberService memberService = new MemberServiceImpl(null);
//        OrderService orderService = new OrderServiceImpl(null, null);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order  = " + order);

    }

}
