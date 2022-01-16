package servlet.basic.web.frontcontroller.v2.controller;

import servlet.basic.web.frontcontroller.MyView;
import servlet.basic.web.frontcontroller.v2.ControllerV2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.server.ServerCloneException;

public class MemberFormControllerV2 implements ControllerV2 {

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServerCloneException, IOException, ServletException {
        return new MyView("/WEB-INF/views/new-form.jsp");
    }

}
