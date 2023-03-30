package com.jdbc.tutorial.queries;

import java.sql.*;

public class CreateDatabase {
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
			String sql = "CREATE DATABASE JDBC_TEST";
			
			//String sql = "DROP DATABASE JDBC_TEST";
			
			//create table
			/*
			 * String sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " +
			 * " first VARCHAR(255), " + " last VARCHAR(255), " + " age INTEGER, " +
			 * " PRIMARY KEY ( id ))";
			 */
			
			//Drop table
			//String sql = "DROP TABLE REGISTRATION";
			
			//Insert record
	        // String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
			
			//Update
			/*
			 * String sql = "UPDATE Registration " + "SET age = 30 WHERE id in (100, 101)";
			 */
			
			//Delete
			/*
			 * String sql = "DELETE FROM Registration " + "WHERE id = 101";
			 */
			

			Statement stmnt = conn.createStatement();
	
			stmnt.executeUpdate(sql);

			System.out.println("Data base created ");

			conn.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
	}

}
