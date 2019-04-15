package com.chamodshehanka.heshanhardware.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 4/14/2019
 * @project HeshanHardware
 **/
public abstract class SuperServlet extends HttpServlet {

    public SuperServlet() {
        super();
    }

    protected abstract void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException;

    protected abstract void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException;
}
