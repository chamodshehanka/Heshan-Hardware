package com.chamodshehanka.heshanhardware.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {

    public static final long serialVersionUID = 1L;

    public AddEmployeeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().append("Served at: ").append(httpServletRequest.getContextPath());
    }

    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

}
