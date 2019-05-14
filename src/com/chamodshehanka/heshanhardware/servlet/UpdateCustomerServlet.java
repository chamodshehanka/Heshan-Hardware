package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.model.Customer;
import com.chamodshehanka.heshanhardware.service.custom.CustomerService;
import com.chamodshehanka.heshanhardware.service.custom.impl.CustomerServiceImpl;

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

        CustomerService customerService = new CustomerServiceImpl();
        boolean isUpdated = customerService.update(customerID,
                new Customer(customerID,name, gender,address,phone));

        if (isUpdated){
            request.getRequestDispatcher("/manage-customer.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/manage-customer.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
