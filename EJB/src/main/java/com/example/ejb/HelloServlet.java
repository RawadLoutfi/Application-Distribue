package com.example.ejb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.ejb.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
@ejb
public class HelloServlet extends HttpServlet{
    private DevoirEJB msg;

    public void init() {
        msg = new HelloWorldBean();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + msg.sayHello() + "</h1>");
        out.println("</body></html>");
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ````11111111
    public void destroy() {
    }
}