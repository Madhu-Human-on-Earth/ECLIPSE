package dbconnectivity;
import java.sql.*;
public class retrievedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","madhu");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		ResultSetMetaData rm=rs.getMetaData();
		int n=rm.getColumnCount();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i)+"\t");
		}
			System.out.println();
		
	
		while(rs.next())
		{
			for(int i=1;i<n;i++)
			{
				System.out.print(rs.getString(i)+"  || ");
			}
			System.out.println();
		}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
