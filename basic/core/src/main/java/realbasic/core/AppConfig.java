package realbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import realbasic.core.discount.DiscountPolicy;
import realbasic.core.discount.RateDiscountPolicy;
import realbasic.core.member.MemberRepository;
import realbasic.core.member.MemberService;
import realbasic.core.member.MemberServiceImpl;
import realbasic.core.member.MemoryMemberRepository;
import realbasic.core.order.OrderService;
import realbasic.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    //@Bean memberService => new MemoryMemberRepository()
    //@Bean orderService => new MemoryMemberRepository()

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        System.out.println("call AppConfig.discountPolicy");
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
