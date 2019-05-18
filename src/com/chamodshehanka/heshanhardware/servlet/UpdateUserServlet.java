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
 * @author chamodshehanka on 5/19/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "UpdateUserServlet", urlPatterns = "/UpdateUser")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String type = request.getParameter("type");

        boolean isUpdated = UserController.updateUser(new User(userID,username,password,type));
        if (isUpdated){
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
