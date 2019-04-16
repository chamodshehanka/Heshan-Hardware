package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.service.custom.EmployeeService;
import com.chamodshehanka.heshanhardware.service.custom.impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 4/14/2019
 * @project HeshanHardware
 **/
public class DeleteEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1871871796669342804L;

    public DeleteEmployeeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        httpServletResponse.setContentType("text/html");

        String employeeID = httpServletRequest.getParameter("employeeID");

        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.remove(employeeID);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
        requestDispatcher.forward(httpServletRequest, httpServletResponse);
    }
}
