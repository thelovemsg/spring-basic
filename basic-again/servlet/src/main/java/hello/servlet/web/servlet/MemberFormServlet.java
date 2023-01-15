package hello.servlet.web.servlet;

import hello.servlet.domain.member.MemberRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet/members/new-form")
public class MemberFormServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter w = response.getWriter();
        w.write("<!DOCTYPE html>");
        w.write("<html>");
        w.write("<head>");
        w.write("<meta charset=\"UTF-8\">");
        w.write("<title>Title</title>");
        w.write("</head>");
        w.write("<body>");
        w.write("<form action=\"/servlet/members/save\" method=\"post\">");
        w.write("username: <input type=\"text\" name=\"username\" />");
        w.write("age:      <input type=\"text\" name=\"age\" />");
        w.write("<button type=\"submit\">전송</button>");
        w.write("</form>");
        w.write("</body>");
        w.write("</html>");
    }
}
