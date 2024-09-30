package dbconnectivity;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class blobdemo{
	    public static void main(String[] args) {
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "root");

	            PreparedStatement pstmnt = con.prepareStatement("insert into images values(?,?)");
	            pstmnt.setString(1, args[0]);
	            FileInputStream fis = new FileInputStream(args[1]);
	            pstmnt.setBinaryStream(2, fis, fis.available());
	            pstmnt.executeUpdate();
	            System.out.println("One image inserted successfully..");

	            // Close resources
	            fis.close();
	            pstmnt.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
