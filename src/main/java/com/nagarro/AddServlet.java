package com.nagarro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Employee emp = new Employee(100, request.getParameter("name"),
				request.getParameter("city"), Integer.parseInt(request
						.getParameter("age")));

		EmployeeDAO empDao = new EmployeeDAO();
		empDao.addEmp(emp);

		// System.out.println(emp.getId());
		response.sendRedirect("Popup.jsp?id=" + emp.getId());
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}
