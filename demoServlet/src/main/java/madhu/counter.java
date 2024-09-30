package madhu;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class counter
 */
public class counter extends GenericServlet {
int count=0;   

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	pw.println("<html><body bgcolor=green text=yellow><h1>");
		
	pw.println("This page has been accessed "+(++count)+" times");
	pw.println("</h1></body></html>");
	}

}
