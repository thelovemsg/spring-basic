package realbasic.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import realbasic.core.discount.DiscountPolicy;
import realbasic.core.member.MemberRepository;
import realbasic.core.member.MemoryMemberRepository;
import realbasic.core.order.OrderService;
import realbasic.core.order.OrderServiceImpl;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes=Configuration.class)
) // @Component 등록이 된 class를 찾아서 자동으로 등록함. 수동 등록한 아이는 일단 제외
public class AutoAppConfig {

//    @Autowired MemberRepository memberRepository;
//    @Autowired DiscountPolicy discountPolicy;
//
//    @Bean
//    OrderService orderService(){
//        return new OrderServiceImpl(memberRepository, discountPolicy);
//    }
//
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }

}
