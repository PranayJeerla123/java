package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class Addition extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(req.getParameter("number1"));
		int b=Integer.parseInt(req.getParameter("number2"));
		PrintWriter out=res.getWriter();
		out.println("Result :"+(a+b));
		System.out.println("Done");
	}

}
