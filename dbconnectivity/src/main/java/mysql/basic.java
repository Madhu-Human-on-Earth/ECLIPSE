package mysql;
import java.sql.*;
public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
				Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");//Establishing connection
				System.out.println("Connected With the mysql database successfully");
				
			} catch (SQLException e) {
				
				System.out.println("Error while connecting to the database");
			
					}
		
	}

}
