package com.jdbc.tutorial.queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDemo {
	
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
			
			Statement st = conn.createStatement();
			
			//String sql = "create database jdbc_demo";
			//String sql = "drop database jdbc_demo";
			
			/*
			 * String sql = "create table tharun_db.customers1\r\n" + "(\r\n" +
			 * "custId int not null,\r\n" + "custName varchar(100),\r\n" +
			 * "custAdd varchar(300),\r\n" + "custPhone varchar(10),\r\n" +
			 * "primary key(custId)\r\n" + ");";
			 */
			
			
			//String sql = "drop table tharun_db.customers1";
			/*
			 * String sql = "create table tharun_db.bike(\r\n" + "id int,\r\n" +
			 * "color varchar(40),\r\n" + "name varchar(50)\r\n" + ");";
			 */
			
			//String sql = "insert into tharun_db.bike(id,color,name) values(2,'orange','duke')";
			
			//String sql = "update tharun_db.bike set color='green' where id = 1";
			String sql = "delete from tharun_db.bike where id =2";
			int noOfRowsImpacted = st.executeUpdate(sql);
			
			System.out.println(noOfRowsImpacted);
			


			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	
	}

}
