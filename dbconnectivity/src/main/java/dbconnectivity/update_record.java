package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class update_record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root"); 
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select rollno,name,marks from student");
			rs.absolute(2);
			rs.updateInt(3, 86);
			rs.updateRow();
			System.out.println("updated");
		
	}catch (Exception e) {
		// TODO: handle exceptions
	}
	}

}
