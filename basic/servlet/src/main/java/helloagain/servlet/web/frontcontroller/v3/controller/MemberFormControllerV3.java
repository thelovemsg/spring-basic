package helloagain.servlet.web.frontcontroller.v3.controller;

import helloagain.servlet.web.frontcontroller.ModelView;
import helloagain.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }

}
