package com.jdbc.tutorial;

import java.sql.*;

public class Statement_Execute_Update_Demo {
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
			//insert single row
			int impactedRows = st.executeUpdate(
					"insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(14,'bond','fullsatck',90,'ece'), (15,'james_bond','fullsatck',90,'ece');");

			//insert 2 rows
			/*
			 * int impactedRows = st.executeUpdate(
			 * "insert into tharun_db.stundent_info1(id,name,course,marks,branch) values(8,'vijay','core java',30,'mech'),(9,'shiva','core java',30,'mech')"
			 * );
			 */

			System.out.println("No.of rows Inserted :: " + impactedRows);

			conn.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
