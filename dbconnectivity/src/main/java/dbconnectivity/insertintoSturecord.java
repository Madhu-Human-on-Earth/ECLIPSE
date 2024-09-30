package dbconnectivity;
import java.sql.*;
public class insertintoSturecord {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(3,'cu',89)");
			
			System.out.println("one record inserted successfully...");
			
				
		}
		catch(Exception e)
		{
			System.err.println();
		}

	}

}
