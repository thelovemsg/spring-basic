package servlet.basic.web.frontcontroller.v1.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.server.ServerCloneException;

public interface ControllerV1 {

    void process(HttpServletRequest request, HttpServletResponse response) throws ServerCloneException, IOException, ServletException;

}
