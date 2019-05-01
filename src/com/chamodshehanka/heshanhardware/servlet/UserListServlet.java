package com.chamodshehanka.heshanhardware.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 4/30/2019
 * @project HeshanHardware
 **/
public class UserListServlet extends HttpServlet {

    public UserListServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {



        httpServletResponse.setContentType("text/html");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("index.jsp");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }

}
