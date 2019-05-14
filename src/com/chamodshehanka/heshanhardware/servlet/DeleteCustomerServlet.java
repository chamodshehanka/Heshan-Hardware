package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.service.custom.CustomerService;
import com.chamodshehanka.heshanhardware.service.custom.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author chamodshehanka on 5/14/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "DeleteCustomerServlet", urlPatterns = "/DeleteCustomer")
public class DeleteCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerService customerService = new CustomerServiceImpl();
        String customerID = request.getParameter("customerID");
        boolean isDeleted = customerService.remove(customerID);

        if (isDeleted){
            request.getRequestDispatcher("/manage-customer.jsp");
        }else {
            response.setContentType("text/html");
            PrintWriter pw=response.getWriter();
            pw.println("<script type=\"text/javascript\">");
            pw.println("alert('Invalid Username or Password');");
            pw.println("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
