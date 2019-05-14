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
@WebServlet(name = "GetCustomerServlet", urlPatterns = "/SearchCustomer")
public class GetCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerService customerService = new CustomerServiceImpl();
        String customerID = request.getParameter("customerID");
        Customer customer = customerService.getByID(customerID);

        response.setContentType("text/html");
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("/manage-customer.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
