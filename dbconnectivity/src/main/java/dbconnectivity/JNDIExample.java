package dbconnectivity;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;


	public class JNDIExample {
	    public static void main(String[] args) {
	        try {
	            // Create initial context
	            Context ctx = new InitialContext();

	            // Look up the data source
	            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myDataSource");

	            // Get a database connection from the data source
	            Connection conn = ds.getConnection();

	            // Use the connection...

	            // Close the connection
	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}




