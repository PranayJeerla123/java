package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HServlet")
public class HServlet extends HttpServlet {
    public HServlet() {
        super();
        
    }
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().println("Service");
//	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("doPost");
	}

}
