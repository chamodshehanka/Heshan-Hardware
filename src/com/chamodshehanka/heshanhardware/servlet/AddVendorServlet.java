package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.VendorController;
import com.chamodshehanka.heshanhardware.model.Vendor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 5/15/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "AddVendorServlet", urlPatterns = "/AddVendor")
public class AddVendorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vendorID = request.getParameter("vendorID");
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String email = request.getParameter("email");

        boolean isAdded = VendorController.addVendor(new Vendor(vendorID,name,type,phone,email));

        if (isAdded){
            request.setAttribute("message", "done");
            request.getRequestDispatcher("/manage-vendor.jsp").forward(request,response);
        }else {
            request.setAttribute("message", "error");
            request.getRequestDispatcher("/manage-vendor.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
