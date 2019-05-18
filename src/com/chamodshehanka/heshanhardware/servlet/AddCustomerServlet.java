package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.CustomerController;
import com.chamodshehanka.heshanhardware.model.Customer;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "AddCustomerServlet", urlPatterns = "/AddCustomer")
public class AddCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerID = request.getParameter("customerID");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));

        boolean isAdded = CustomerController.addCustomer(new Customer(customerID, name, gender, address, phone));

        if (isAdded){
            request.setAttribute("message", "done");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/manage-customer.jsp");
            requestDispatcher.forward(request, response);
        }else {
            request.setAttribute("message", "error");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/error.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
}
