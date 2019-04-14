package com.chamodshehanka.heshanhardware.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chamodshehanka on 4/14/2019
 * @project HeshanHardware
 **/
public abstract class SuperServlet extends HttpServlet {

    public SuperServlet() {
        super();
    }

    protected abstract void goGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);

    protected abstract void goPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
}
