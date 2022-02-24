package helloagain.servlet.web.frontcontroller.v3.controller;

import helloagain.servlet.domain.member.Member;
import helloagain.servlet.domain.member.MemberRepository;
import helloagain.servlet.web.frontcontroller.ModelView;
import helloagain.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String userName = paramMap.get("userName");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(userName, age);
        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;

    }
}
