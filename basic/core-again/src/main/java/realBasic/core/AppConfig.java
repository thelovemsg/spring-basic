package realBasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import realBasic.core.discount.DiscountPolicy;
import realBasic.core.discount.RateDiscountPolicy;
import realBasic.core.member.MemberService;
import realBasic.core.member.MemberServiceImpl;
import realBasic.core.member.MemoryMemberRepository;
import realBasic.core.order.OrderService;
import realBasic.core.order.OrderServiceImpl;


/**
 * application에 대한 환경 구성을 담당하는 파일을 생성.
 * 애프리케이션의 실제 동작에 필요한 구현 객체 생성
 *
 * 생성자를 통해서 주입해줌.
 *
 * 객체의 생성과 연결은 AppConfig가 담당
 *
 * 역할과 구현을 한 번에 구성
 *
 * 사용 영역의 코드는 걸들이지 않고 구성 영역의 코드의 수정만으로 편하게 정책을 변경이 가능하다.
 *
 * 사용 영역에는 닫혀 있고, 구성에만 열려 있어 OCP 충족
 *
 */
@Configuration
public class AppConfig {

    //@Bean memberService => new MemoryMemberRepository()
    //@Bean orderService => new MemoryMemberRepository()

    @Bean
    public MemberService memberService(){
        System.out.println("AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        System.out.println("AppConfig.discountPolicy");
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
