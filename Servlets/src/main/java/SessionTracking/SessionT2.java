package SessionTracking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionT2
 */
@WebServlet("/SessionT2")
public class SessionT2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] c=request.getCookies();
		try {
			if(c.length==0) {
				response.sendRedirect("SessionTracking.html");
			}
			else
			  response.getWriter().println(c[0].getValue()+" --- "+c[1].getValue());
		}
		catch(Exception e) {
			response.sendRedirect("SessionTracking.html");
		}
		
	}

}
