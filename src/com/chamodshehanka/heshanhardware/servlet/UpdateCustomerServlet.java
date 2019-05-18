package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.CustomerController;
import com.chamodshehanka.heshanhardware.model.Customer;

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
@WebServlet(name = "UpdateCustomerServlet", urlPatterns = "/UpdateCustomer")
public class UpdateCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerID = request.getParameter("customerID");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));

        boolean isUpdated = CustomerController.updateCustomer(new Customer(customerID,name, gender,address,phone));

        if (isUpdated){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-customer.jsp").forward(request, response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-customer.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
