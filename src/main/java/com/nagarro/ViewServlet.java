package com.nagarro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		String empId = arg0.getParameter("name");
		Integer empIdInInt = Integer.parseInt(empId);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee employee = employeeDAO.viewEmp(empIdInInt);
		arg0.setAttribute("employee", employee);
		RequestDispatcher dispatcher = arg0.getRequestDispatcher("/View.jsp");
		dispatcher.forward(arg0, arg1);
	}

	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		doGet(arg0, arg1);
	}

}
