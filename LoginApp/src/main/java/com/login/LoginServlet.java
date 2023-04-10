package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.DBConnection;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 937803377641025542L;
	int count;
	String wish;

	@Override
	public void init(ServletConfig config) throws ServletException {

		count = Integer.parseInt(config.getInitParameter("count"));// init param

		wish = config.getServletContext().getInitParameter("wish"); // context param

		System.out.println("*********************count**********" + count);
		System.out.println("*********************wish**********" + wish);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("name");
		String password = req.getParameter("pwd");
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");

		try {

			/*
			 * Class.forName("com.mysql.jdbc.Driver");
			 * 
			 * String dbURL =
			 * "jdbc:mysql://127.0.0.1:3306/tharun_db?characterEncoding=latin1"; String
			 * userName = "root"; String pwd = "root";
			 * 
			 * Connection con = DriverManager.getConnection(dbURL, userName, pwd);
			 */
			Connection con = DBConnection.getConnection();
			String sql = "select  * from tharun_db.login_details where username = ? and password = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("---------------Login successful---------------");
				RequestDispatcher rd = req.getRequestDispatcher("display");
				rd.forward(req, resp);

			} else {
				System.out.println("---------------in valid Login cred---------------");
				pw.println("<span style=\"color: red; font-weight: bold;\">In valid credintials</span>");
				RequestDispatcher rd = req.getRequestDispatcher("/index.html");
				rd.include(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
