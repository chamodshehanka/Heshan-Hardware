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
 * @author chamodshehanka on 5/9/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "UpdateItemServlet", urlPatterns = "/UpdateItem")
public class UpdateItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ItemService itemService = new ItemServiceImpl();

        String itemCode = request.getParameter("");
        String description = request.getParameter("");
        String brand = request.getParameter("");
        double unitPrice = Double.parseDouble(request.getParameter(""));
        int qty = Integer.parseInt(request.getParameter(""));

        boolean isUpdated = itemService.update(itemCode,
                    new Item(itemCode, description, brand, unitPrice, qty));

        if (isUpdated) {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("manage-item.jsp");
            requestDispatcher.forward(request, response);
        }else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("error.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
