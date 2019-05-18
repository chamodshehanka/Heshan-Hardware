package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.AdminController;
import com.chamodshehanka.heshanhardware.controller.UserController;
import com.chamodshehanka.heshanhardware.model.Admin;
import com.chamodshehanka.heshanhardware.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/8/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "SignUpServlet", urlPatterns = "/signUp")
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userID = UserController.getNewUserID();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userType = "Admin";

        boolean isValidUserName = true;

        ArrayList<User> userArrayList = UserController.getAllUsers();
        for (User user: userArrayList
        ) {
            if (user.getUserName().equals(username)){
                isValidUserName = false;
            }
        }

        if (isValidUserName) {
            boolean isAdded = UserController.addUser(new User(userID, username, password, userType));
            boolean isAdminAdded = AdminController.addAdmin(new Admin(AdminController.getNewAdminID(),username,password));

            if (isAdded && isAdminAdded){
                request.setAttribute("message", "done");
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/dashboard.jsp");
                requestDispatcher.forward(request, response);
            }else {
                request.setAttribute("message", "error");
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/error.jsp");
                requestDispatcher.forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
