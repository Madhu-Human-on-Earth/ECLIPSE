package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleResultSetMetaData;

import java.sql.*;

public class moveDemo {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root"); 
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select * from student");
			rs.absolute(5);
			System.out.print(rs.getInt("rollno")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.println(rs.getInt("marks"));
	}catch (Exception e) {
		// TODO: handle exception
	}
	}

}
