package dbconnectivity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;
import oracle.jdbc.rowset.OracleJDBCRowSet;
import oracle.jdbc.rowset.OracleWebRowSet;

public class rowSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//jdbcrowset
			//JdbcRowSet jrs = new OracleJDBCRowSet();
			WebRowSet jrs = new OracleWebRowSet();
			//CachedRowSet jrs = new OracleCachedRowSet();
			
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("SYSTEM");
			jrs.setPassword("root");
			jrs.setCommand("select * from student");
			jrs.execute();
			FileOutputStream fos=new FileOutputStream("student.xml");
			jrs.writeXml(fos);
			
//			while(jrs.next())
//			{
//				System.out.print(jrs.getInt("ROLLNO")+"\t");
//				System.out.print(jrs.getString("NAME")+"\t");
//				System.out.println(jrs.getInt("MARKS"));
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}
