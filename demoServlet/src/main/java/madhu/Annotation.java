package madhu;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Annotation
 */
@WebServlet("/annotation")
public class Annotation extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
PrintWriter pw=response.getWriter();
pw.println("welcome");
	}

}
