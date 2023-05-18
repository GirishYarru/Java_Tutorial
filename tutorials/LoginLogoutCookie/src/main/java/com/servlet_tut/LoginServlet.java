package com.servlet_tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("admin123")) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, " + name);

			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
			RequestDispatcher rd = request.getRequestDispatcher("link.html");
			rd.include(request, response);
		} else {
			out.print("sorry, username or password error!");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

		out.close();
	}

}