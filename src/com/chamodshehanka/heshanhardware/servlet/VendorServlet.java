package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.model.Vendor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VendorServlet")
public class VendorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {httpServletResponse.setContentType("text/html");

        Vendor employee = new Vendor();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { httpServletResponse.getWriter().append("Served at: ").append(httpServletRequest.getContextPath()

    }
}
