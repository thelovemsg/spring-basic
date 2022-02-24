package helloagain.servlet.web.frontcontroller.v3.controller;

import helloagain.servlet.domain.member.Member;
import helloagain.servlet.domain.member.MemberRepository;
import helloagain.servlet.web.frontcontroller.ModelView;
import helloagain.servlet.web.frontcontroller.MyView;
import helloagain.servlet.web.frontcontroller.v2.ControllerV2;
import helloagain.servlet.web.frontcontroller.v3.ControllerV3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
