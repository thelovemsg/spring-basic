package servlet.basic.web.frontcontroller.v2;

import lombok.SneakyThrows;
import servlet.basic.web.frontcontroller.MyView;
import servlet.basic.web.frontcontroller.v1.controller.ControllerV1;
import servlet.basic.web.frontcontroller.v1.controller.MemberFormControllerV1;
import servlet.basic.web.frontcontroller.v1.controller.MemberListControllerV1;
import servlet.basic.web.frontcontroller.v1.controller.MemberSaveControllerV1;
import servlet.basic.web.frontcontroller.v2.controller.MemberFormControllerV2;
import servlet.basic.web.frontcontroller.v2.controller.MemberListControllerV2;
import servlet.basic.web.frontcontroller.v2.controller.MemberSaveControllerV2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV2", urlPatterns = "/front-controller/v2/*")
public class FrontControllerServletV2 extends HttpServlet {

    private Map<String, ControllerV2> controllerMap = new HashMap<>();

    public FrontControllerServletV2() {
        controllerMap.put("/front-controller/v2/members/new-form", new MemberFormControllerV2());
        controllerMap.put("/front-controller/v2/members/save", new MemberSaveControllerV2());
        controllerMap.put("/front-controller/v2/members", new MemberListControllerV2());
    }

    @SneakyThrows
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV1.service");

        String requestURI = request.getRequestURI();

        ControllerV2 controllerV2 = controllerMap.get(requestURI);
        if (controllerV2 == null){
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        MyView view = controllerV2.process(request, response);
        view.render(request, response);
    }
}
