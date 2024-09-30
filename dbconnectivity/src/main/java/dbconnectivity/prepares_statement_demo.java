package dbconnectivity;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class prepares_statement_demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	
		
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521","system","madhu");
PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");

pstmt.setInt(1,Integer.parseInt(args[0]));
pstmt.setString(2, args[1]);
pstmt.setInt(3, Integer.parseInt(args[2]));
pstmt.executeUpdate();
System.out.println("one record inserted successfully..");

		}
		catch(NumberFormatException | ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
