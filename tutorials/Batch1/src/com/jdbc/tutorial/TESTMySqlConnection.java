package com.jdbc.tutorial;
import java.sql.*;

public class TESTMySqlConnection {
	
	public static void main(String[] args) {
		
		try {
			//step 2 - load mysql driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//formulate the database address
			
			//jdbc:mysql://hostName:portNumber/dbName
			String dbURL = "jdbc:mysql://127.0.0.1:3306/tharun_db?characterEncoding=latin1";
			String userName = "root";
			String pwd = "root";
			
			
			
			//step-4 create a connection from application to MYSQL DB
			Connection conn = DriverManager.getConnection(dbURL, userName, pwd);
			
			
			if(conn == null) {
				System.out.println("connection failed");
			}else {
				System.out.println("successfully connected");
			}
			
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}