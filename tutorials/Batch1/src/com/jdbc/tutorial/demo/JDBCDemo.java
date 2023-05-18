package com.jdbc.tutorial.demo;


import java.sql.*;

public class JDBCDemo {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String dbURL = "jdbc:mysql://127.0.0.1:3306/tharun_db?characterEncoding=latin1";
			String userName = "root";
			String pwd = "root";
			
			Connection con = DriverManager.getConnection(dbURL,userName,pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from tharun_db.stundent_info1");
			
			while(rs.next()) {
				System.out.println(rs.getString("name")+" "+ rs.getString("course"));
			}
			
			
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
