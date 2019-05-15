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
@WebServlet(name = "GetVendorServlet", urlPatterns = "/SearchVendor")
public class GetVendorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String vendorID = request.getParameter("vendorID");
        Vendor vendor = VendorController.getVendorByID(vendorID);
        response.setContentType("text/html");
        request.setAttribute("vendor", vendor);
        request.getRequestDispatcher("/manage-vendor.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
