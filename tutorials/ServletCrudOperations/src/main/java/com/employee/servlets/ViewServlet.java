package com.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.Employee;
import com.employee.dao.EmployeeDao;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='index.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");

		List<Employee> list = EmployeeDao.getAllEmployees();

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Age</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
		for (Employee e : list) {
			out.print("<tr><td>" + e.getId() + "</td><td>" + e.getFirstName() + "</td><td>" + e.getLastName()
					+ "</td><td>" + e.getAge() + "</td><td>" + e.getCountry() + "</td><td><a href='EditServlet?id="
					+ e.getId() + "'>edit</a></td><td><a href='DeleteServlet?id=" + e.getId()
					+ "'>delete</a></td></tr>");
		}
		out.print("</table>");

		out.close();
	}
}