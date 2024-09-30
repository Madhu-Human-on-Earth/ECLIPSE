package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class batchrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521","SYSTEM","root");
Statement stmt=con.createStatement();
stmt.addBatch("insert into student values(9,'iii',82)");
stmt.addBatch("update student set marks=79 where rollno=3");
stmt.addBatch("delete student where rollno=6");
stmt.executeBatch();
System.out.println("done..");
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
}
