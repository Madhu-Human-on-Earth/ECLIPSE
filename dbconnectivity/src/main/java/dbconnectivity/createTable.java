package dbconnectivity;
import java.sql.*;
public class createTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
   
	Statement stmnt=con.createStatement();
	stmnt.execute("create table student(rollno number(3),name varchar2(10), marks number(3))");
	System.out.println("Table created successfully..");

}
catch(Exception e)
{
	System.err.println(e);
}
	}

}
