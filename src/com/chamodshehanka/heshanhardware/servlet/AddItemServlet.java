package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.model.Item;
import com.chamodshehanka.heshanhardware.service.custom.ItemService;
import com.chamodshehanka.heshanhardware.service.custom.impl.ItemServiceImpl;

import javax.servlet.RequestDispatcher;
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
        ItemService itemService = new ItemServiceImpl();

        String itemCode = request.getParameter("itemCode");
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        itemService.add(new Item(itemCode,description,brand,unitPrice,qty));

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("manage-item.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ItemService itemService = new ItemServiceImpl();

        String itemCode = request.getParameter("itemCode");
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        itemService.add(new Item(itemCode,description,brand,unitPrice,qty));

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("manage-item.jsp");
        requestDispatcher.forward(request, response);
    }
}
