package SessionTracking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionT1
 */
@WebServlet("/SessionT1")
public class SessionT1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("name");
		String password=request.getParameter("password");
		Cookie c1=new Cookie("Username",username);
		response.addCookie(c1);
		Cookie c2=new Cookie("Password",password);
		response.addCookie(c2);
		RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
		rd.forward(request, response);
		
	}
}
