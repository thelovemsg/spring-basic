package realbasic.core;

import realbasic.core.member.Grade;
import realbasic.core.member.Member;
import realbasic.core.member.MemberService;
import realbasic.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }

}
