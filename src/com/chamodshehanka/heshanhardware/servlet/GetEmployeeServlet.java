package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.model.Employee;
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
public class GetEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public GetEmployeeServlet() {
        super();
    }

    protected void goGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

    }

    protected void goPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        httpServletResponse.setContentType("text/html");

        String employeeID = httpServletRequest.getParameter("employeeID");

        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = employeeService.getByID(employeeID);

        httpServletRequest.setAttribute("employee", employee);
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/GetEmployee.jsp");
        requestDispatcher.forward(httpServletRequest, httpServletResponse);
    }
}
