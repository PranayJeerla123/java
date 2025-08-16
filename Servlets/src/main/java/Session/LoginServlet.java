package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		HttpSession s=request.getSession(true);
		s.setAttribute("fname", fname);
		s.setAttribute("lname",lname);
		s.setAttribute("username",username);
		s.setAttribute("password",password);
		
		
	}

}
