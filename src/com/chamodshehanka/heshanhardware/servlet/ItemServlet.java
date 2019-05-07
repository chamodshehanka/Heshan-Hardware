package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.model.Item;
import com.chamodshehanka.heshanhardware.service.custom.ItemService;
import com.chamodshehanka.heshanhardware.service.custom.impl.ItemServiceImpl;

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
@WebServlet(name = "Item", urlPatterns = "/Item")
public class ItemServlet extends HttpServlet {

    private ItemService itemService;

    public void init(){
        itemService = new ItemServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();

        switch (action){
            case "/add":
                addItem(req, resp);
                break;
            case "/update":
                updateItem(req, resp);
                break;
            case "/delete":
                deleteItem(req, resp);
                break;
            case "/search":
                searchItem(req, resp);
                break;
        }
    }

    private void searchItem(HttpServletRequest req, HttpServletResponse resp) {
        String itemCode = req.getParameter("itemCode");
        Item item = itemService.getByID(itemCode);
    }

    private void deleteItem(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void updateItem(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void addItem(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String itemCode = request.getParameter("itemCode");
//        String description = request.getParameter("description");
//        String brand = request.getParameter("brand");
//        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
//        int qty = Integer.parseInt(request.getParameter("qty"));
//
//        itemService.add(new Item(itemCode,description,brand,unitPrice,qty));
//
//        response.sendRedirect("item");
    }
}
