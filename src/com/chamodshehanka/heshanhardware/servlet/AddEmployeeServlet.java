package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.model.Employee;
import com.chamodshehanka.heshanhardware.service.custom.EmployeeService;
import com.chamodshehanka.heshanhardware.service.custom.impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends SuperServlet {

    public static final long serialVersionUID = 1L;

    public AddEmployeeServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().append("Served at: ").append(httpServletRequest.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        httpServletResponse.setContentType("text/html");

        Employee employee = new Employee();

        //set values to setters

        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.add(employee);

        httpServletRequest.setAttribute("employee", employee);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListEmployees.jsp");
        requestDispatcher.forward(httpServletRequest, httpServletResponse);
    }

}
