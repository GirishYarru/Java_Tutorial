package com.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.Employee;
import com.employee.dao.EmployeeDao;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String age = request.getParameter("age");
		String country = request.getParameter("country");

		Employee e = new Employee();
		e.setFirstName(fName);
		e.setLastName(lName);
		e.setAge(Integer.valueOf(age));
		e.setCountry(country);

		int status = EmployeeDao.save(e);
		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		} else {
			out.println("Sorry! unable to save record");
		}

		out.close();
	}

}