
//step 1
import java.sql.*;

public class JDBC_CONNECTION_DEMO {

	public static void main(String[] args) {

		// step 2
		// load mysql driver
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// step3 database url formulation
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/tharun_db?characterEncoding=latin1";
			String userName = "root";
			String pwd = "root";

			// step 4
			// Create database connection
			Connection con = DriverManager.getConnection(dbUrl, userName, pwd);
			if (con == null) {
				System.out.println(" *** connection creation failed ***");
			} else {
				System.out.println(" ===== connection creation is sucessful =====");
				//con.close();
			}
			
			
			//To run sql queries/commands you have to create statement and use it
		//statemt
		//preparedStatement
	    //callStatement
			
	
	  //Statement
		Statement st = con.createStatement();
		// executeQuery() -> gives you resultset
		//executeUpdate() -> gived you number of rows impacted
		//execute() -> returns true if sql query is executed or false if not executed
		
		
		ResultSet rs = st.executeQuery("select * from tharun_db.stundent_info1");
		
		while(rs.next()) {
			System.out.println(rs.getString("name")+" "+ rs.getString("course")+ " "+ + rs.getInt("marks"));
			
		}
		
		
       con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
