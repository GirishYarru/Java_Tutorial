package com.jdbc.tutorial.preparedstmnt.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement_Execute_Update {
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
			String sql = "insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(?,?,?,?,?)";
			
			
			

			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 16);
			pstmt.setString(2, "Lokesh1");
			pstmt.setString(3, "backend");
			pstmt.setInt(4, 27);
			pstmt.setString(5, "civil");
			int noOfRowsImpacted = pstmt.executeUpdate();

			System.out.println(noOfRowsImpacted);

			conn.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
