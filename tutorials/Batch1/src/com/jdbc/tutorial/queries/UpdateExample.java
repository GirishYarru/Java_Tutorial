package com.jdbc.tutorial.queries;
import java.sql.*;

public class UpdateExample {

	public static void main(String[] args) {
		


		try {
			// step 2 - load mysql driver
			Class.forName("com.mysql.jdbc.Driver");

			// formulate the database address

			// jdbc:mysql://hostName:portNumber/dbName
			String dbURL = "jdbc:mysql://127.0.0.1:3306/tharun_db?characterEncoding=latin1";
			String userName = "root";
			String pwd = "root";

			// step-4 create a connection from application to MYSQL DB
			Connection conn = DriverManager.getConnection(dbURL, userName, pwd);

			Statement st = conn.createStatement();
			
			String sql = "";

			ResultSet rs = st.executeQuery(sql + " ORDER BY first ASC");
	         while(rs.next()){
	            //Display values
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(", Age: " + rs.getInt("age"));
	            System.out.print(", First: " + rs.getString("first"));
	            System.out.println(", Last: " + rs.getString("last"));
	         }

			conn.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
	}
}
