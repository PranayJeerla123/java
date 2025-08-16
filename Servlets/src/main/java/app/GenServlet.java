package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method");
		PrintWriter out=res.getWriter();
		out.println("response");
		
	}

}
