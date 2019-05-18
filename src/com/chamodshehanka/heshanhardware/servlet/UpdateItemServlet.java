package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.ItemController;
import com.chamodshehanka.heshanhardware.model.Item;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 5/9/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "UpdateItemServlet", urlPatterns = "/UpdateItem")
public class UpdateItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemCode = request.getParameter("itemCode");
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        boolean isUpdated = ItemController.updateItem(new Item(itemCode, description, brand, unitPrice, qty));

        if (isUpdated) {
            request.setAttribute("message", "done");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("manage-item.jsp");
            requestDispatcher.forward(request, response);
        }else {
            request.setAttribute("message", "error");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("error.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
