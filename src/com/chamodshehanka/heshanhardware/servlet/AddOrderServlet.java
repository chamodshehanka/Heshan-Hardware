package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.OrderController;
import com.chamodshehanka.heshanhardware.model.Order;
import com.chamodshehanka.heshanhardware.model.OrderDetail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author chamodshehanka on 5/18/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "AddOrderServlet", urlPatterns = "/AddOrder")
public class AddOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String orderID = request.getParameter("orderID");
        String orderDate = request.getParameter("orderDate");
        String customerID = request.getParameter("customerID");

        String[] array = request.getParameterValues("tblItem");

        ArrayList<OrderDetail> orderDetailArrayList = null;

        boolean isOrderAdded = OrderController.addOrder(new Order(orderID, orderDate, customerID, orderDetailArrayList));

        if (isOrderAdded){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-order.jsp").forward(request, response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-order.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
