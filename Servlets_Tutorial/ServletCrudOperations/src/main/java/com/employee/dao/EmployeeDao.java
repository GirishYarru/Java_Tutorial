package com.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.Employee;

public class EmployeeDao {

	private static Connection conn = null;

	public static Connection getConnection() {

		if (conn != null) {
			return conn;
		}
		try {
			// step 2 - load mysql driver
			Class.forName("com.mysql.jdbc.Driver");

			// formulate the database address

			// jdbc:mysql://hostName:portNumber/dbName
			String dbURL = "jdbc:mysql://127.0.0.1:3306/tharun_db?characterEncoding=latin1";
			String userName = "root";
			String pwd = "root";

			// step-4 create a connection from application to MYSQL DB
			conn = DriverManager.getConnection(dbURL, userName, pwd);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static int save(Employee e) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into tharun_db.employee_details(firstName,lastName,age,country) values (?,?,?,?)");
			ps.setString(1, e.getFirstName());
			ps.setString(2, e.getLastName());
			ps.setInt(3, e.getAge());
			ps.setString(4, e.getCountry());
			status = ps.executeUpdate();
			//con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int update(Employee e) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update tharun_db.employee_details set firstName=?,lastName=?,Age=?,country=? where id=?");
			ps.setString(1, e.getFirstName());
			ps.setString(2, e.getLastName());
			ps.setInt(3, e.getAge());
			ps.setString(4, e.getCountry());
			ps.setInt(5, e.getId());

			status = ps.executeUpdate();

			//con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from tharun_db.employee_details where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();

			//con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();

		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from tharun_db.employee_details");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setAge(rs.getInt(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			//con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	
	public static Employee getEmployeeById(int id){  
        Employee e=new Employee();  
          
        try{  
            Connection con=EmployeeDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from tharun_db.employee_details where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setFirstName(rs.getString(2));  
                e.setLastName(rs.getString(3));  
                e.setAge(rs.getInt(4));  
                e.setCountry(rs.getString(5));  
            }  
           // con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  

}
