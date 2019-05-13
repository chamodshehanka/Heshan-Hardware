package com.chamodshehanka.heshanhardware.servlet;

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
 * @author chamodshehanka on 5/8/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "DeleteItemServlet", urlPatterns = "/DeleteItem")
public class DeleteItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemCode = request.getParameter("itemCode");

        ItemService itemService = new ItemServiceImpl();
        boolean isRemoved = itemService.remove(itemCode);
        System.out.println("Item Code : " + itemCode);
        System.out.println("ITem status : " + isRemoved);
        if (isRemoved){
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/manage-item.jsp");
            requestDispatcher.forward(request, response);
        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/error.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
