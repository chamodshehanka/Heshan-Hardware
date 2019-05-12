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
@WebServlet(name = "Item", urlPatterns = "/ItemController")
public class ItemController extends HttpServlet {

    private ItemService itemService;

    public void init(){
        itemService = new ItemServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action){
            case "/addItemC":
                addItem(request, response);
                break;
            case "/updateItemC":
                updateItem(request, response);
                break;
            case "/deleteItemC":
                deleteItem(request, response);
                break;
            case "/searchItemC":
                searchItem(request, response);
                break;
            case "/editItemC":
                editItem(request,response);
                break;
        }
    }

    private void searchItem(HttpServletRequest request, HttpServletResponse response) {
    }

    private void deleteItem(HttpServletRequest request, HttpServletResponse response) {
    }

    private void updateItem(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String itemCode = request.getParameter("itemCode");
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int qty = Integer.parseInt(request.getParameter("qty"));

        itemService.update(itemCode,
                new Item(itemCode, description,brand,unitPrice,qty));
        response.sendRedirect("");
    }

    private void addItem(HttpServletRequest request, HttpServletResponse response) {
    }

    private void editItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemCode = request.getParameter("ItemCode");

        Item item = itemService.getByID(itemCode);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
        request.setAttribute("item", item);
        requestDispatcher.forward(request,response);
    }

}
