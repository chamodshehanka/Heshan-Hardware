package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.UserController;
import com.chamodshehanka.heshanhardware.model.User;
import com.chamodshehanka.heshanhardware.service.custom.UserService;
import com.chamodshehanka.heshanhardware.service.custom.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author chamodshehanka on 4/16/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        ArrayList<User> userArrayList = UserController.getAllUsers();
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");

        boolean isValidUser = false;

        for (User user : userArrayList) {
            if (user.getUserName().equals(username) && user.getUserPassword().equals(password)){
                isValidUser = true;
            }
        }

        if (isValidUser){
            RequestDispatcher requestDispatcher = getServletContext()
                    .getRequestDispatcher("/dashboard.jsp");
            requestDispatcher.forward(httpServletRequest, httpServletResponse);
        }else {
            httpServletRequest.setAttribute("message", "done");
            httpServletRequest.getRequestDispatcher("/index.jsp").forward(httpServletRequest,httpServletResponse);
        }
    }

}
