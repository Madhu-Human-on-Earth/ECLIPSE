package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select rollno,name,marks from student");
			rs.moveToInsertRow();
			rs.updateInt(1, 8);
			rs.updateString(2, "hhh");
			rs.updateInt(3,80);
			rs.insertRow();
			System.out.println("One reord inserted successfully.");
		
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
