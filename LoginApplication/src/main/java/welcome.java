
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class welcome
 */
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("uname");
		PrintWriter pw=response.getWriter();
		//pw.println("<a href=dark.html>Login</a>");
		RequestDispatcher rd=request.getRequestDispatcher("/dark.html");
		rd.include(request, response);
		
//		pw.println("<html><body bgcolor=cyan text=red><h1>");
//		pw.println("Welcome "+s);
//		pw.println("</h1></body></html>");

	}

}
