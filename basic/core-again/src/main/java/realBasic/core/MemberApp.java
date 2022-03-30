package realBasic.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import realBasic.core.member.Grade;
import realBasic.core.member.Member;
import realBasic.core.member.MemberService;
import realBasic.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("New Member = " + findMember.getName());
        System.out.println("Find Member = " + memberA.getName());
    }

}
