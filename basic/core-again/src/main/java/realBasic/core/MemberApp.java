package realBasic.core;

import realBasic.core.member.Grade;
import realBasic.core.member.Member;
import realBasic.core.member.MemberService;
import realBasic.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("New Member = " + findMember.getName());
        System.out.println("Find Member = " + memberA.getName());
    }

}
