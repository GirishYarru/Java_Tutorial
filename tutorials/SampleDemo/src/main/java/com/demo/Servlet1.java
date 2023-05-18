package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		String userName = req.getParameter("hello");
		
		
		
		PrintWriter out = resp.getWriter();
		out.print("hello hai "+userName);
		out.print("<form action='servlet2'>");
		out.print("<input type='hidden' name='uname' value='" + userName + "'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		out.close();
	}

}
