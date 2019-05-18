package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.UserController;
import com.chamodshehanka.heshanhardware.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 5/18/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "AddUserServlet", urlPatterns = "/AddUser")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("type");

        boolean isAdded = UserController.addUser(new User(userID,username,password,type));
        if (isAdded){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-user.jsp").forward(request,response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-user.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
