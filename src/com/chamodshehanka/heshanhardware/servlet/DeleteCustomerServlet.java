package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.CustomerController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 5/14/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "DeleteCustomerServlet", urlPatterns = "/DeleteCustomer")
public class DeleteCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerID = request.getParameter("customerID");
        boolean isDeleted = CustomerController.removeCustomer(customerID);

        if (isDeleted){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-customer.jsp").forward(request,response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-customer.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
