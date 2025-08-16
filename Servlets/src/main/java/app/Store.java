package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet("/store")
public class Store extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String number=req.getParameter("number");
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
			PreparedStatement ps=con.prepareStatement("insert into servlet values(?,?,?);");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, number);
			System.out.println(ps.executeUpdate()+" record stored");
			
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		PrintWriter out=res.getWriter();
		out.println("Name :"+name);
		out.println("Password :"+password);
		out.println("Mobile Number :"+number);
		
	}

}
