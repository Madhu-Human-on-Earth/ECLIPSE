package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.io.*;
public class basic {
//program to demonstrate prepared statement 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
//	Class.forName("oracle.jdbc.driver.OracleDriver");
	Scanner sc=new Scanner(System.in);
	System.out.println("roll");
	int roll=sc.nextInt();
	System.out.println("string");
	String name=sc.next();
	System.out.println("ma");
int marks=	sc.nextInt();
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
	PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
	pstmt.setInt(1, roll);
	pstmt.setString(2,name);
	pstmt.setInt(3, marks);
	pstmt.executeUpdate();
	System.out.println("One recoed ins succ");
}
catch(Exception e)
{
	System.err.println(e);
}
	}

}
