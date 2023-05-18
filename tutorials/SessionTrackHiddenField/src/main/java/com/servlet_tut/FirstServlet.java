package com.servlet_tut;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String name = request.getParameter("userName");
			out.print("Welcome " + name);

			// creating form that have invisible textfield
			out.print("<form action='servlet2'>");
			out.print("<input type='hidden' name='uname' value='" + name + "'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}