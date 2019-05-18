package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.ItemController;
import com.chamodshehanka.heshanhardware.model.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 5/7/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "AddItemServlet", urlPatterns = "/AddItem")
public class AddItemServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemCode = request.getParameter("itemCode");
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        boolean isAdded = ItemController.addItem(new Item(itemCode,description,brand,unitPrice,qty));

        if (isAdded){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-item.jsp").forward(request,response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-item.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
