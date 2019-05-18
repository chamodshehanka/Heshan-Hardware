package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.ItemController;

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
        boolean isRemoved = ItemController.removeItem(itemCode);

        if (isRemoved){
            request.setAttribute("message", "done");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/manage-item.jsp");
            requestDispatcher.forward(request, response);
        } else {
            request.setAttribute("message", "error");
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/error.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
