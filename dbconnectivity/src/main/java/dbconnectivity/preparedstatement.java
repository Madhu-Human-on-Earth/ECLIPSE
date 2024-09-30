package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class preparedstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
	PreparedStatement pstmt=con.prepareStatement("select marks from student where rollno=?");
	pstmt.setInt(1, Integer.parseInt(args[1]));
	ResultSet rs=pstmt.executeQuery();
	if(rs.next())
	{
		System.out.println(rs.getInt(1));
		
	}
}
catch(Exception e)
{
	System.err.println(e);
}
	}

}
