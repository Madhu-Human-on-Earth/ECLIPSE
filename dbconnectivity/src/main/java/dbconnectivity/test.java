package dbconnectivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
	
	private static final String DB_URL="jdbc:mysql://loaclhost:3306/db";
	private static final String user="Hello";
	private static final String pwd="Hello";
	private static final String api="https://fakestoreapi.com/products";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection =DriverManager.getConnection(DB_URL,user,pwd);
			String apiresponse=fetchDataFromAPI(api);
			parseAndInsertData(apiresponse,connection);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	private static void parseAndInsertData(String apiresponse, Connection connection) {
		// TODO Auto-generated method stub
		
	}



	private static String fetchDataFromAPI(String api2) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		StringBuilder res=new StringBuilder();
				URL url=new URL(api2);
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setRequestMethod("GET");
				BufferedReader in =new BufferedReader(
						new InputStreamReader(
						connection.getInputStream()));
				String 
						
	}

}
