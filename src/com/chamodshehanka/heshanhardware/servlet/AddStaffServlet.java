package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.StaffController;
import com.chamodshehanka.heshanhardware.controller.UserController;
import com.chamodshehanka.heshanhardware.model.Staff;
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
@WebServlet(name = "AddStaffServlet", urlPatterns = "/AddStaff")
public class AddStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String staffID = request.getParameter("staffID");
        String name = request.getParameter("name");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String type = request.getParameter("type");

        String userID = UserController.getNewUserID();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isStaffAdded = StaffController
                .addStaff(new Staff(staffID, name, phone, email, type));
        boolean isUserAdded = UserController.addUser(new User(userID, username, password, type));

        if (isStaffAdded && isUserAdded){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-staff.jsp").forward(request,response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-staff.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
