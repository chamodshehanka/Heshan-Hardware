package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.StaffController;
import com.chamodshehanka.heshanhardware.model.Staff;

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
@WebServlet(name = "UpdateStaffServlet", urlPatterns = "/UpdateStaff")
public class UpdateStaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String staffID = request.getParameter("staffID");
        String name = request.getParameter("name");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");
        String type = request.getParameter("type");

        boolean isUpdated = StaffController.updateStaff(new Staff(staffID,name,phone,email,type));

        if (isUpdated){
            request.getRequestDispatcher("/manage-staff.jsp").forward(request,response);
        }else {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
