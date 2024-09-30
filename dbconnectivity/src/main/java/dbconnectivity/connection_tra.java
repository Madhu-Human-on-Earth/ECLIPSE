package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class connection_tra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(12,'mys',98)");
			con.commit();
			System.out.println("One record insert");

	}catch (Exception e) {
		// TODO: handle exception
	}

}
}
