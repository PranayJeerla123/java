package demo1;
import java.util.*;

import java.sql.*;
public class A {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter name :  ");
 	String name=sc.next();
 	System.out.println("Enter phoneNumber :  ");
 	String phno=sc.next();
 	System.out.println("Enter password :  ");
 	String password=sc.next();
 	try {
 		Class.forName("com.mysql.cj.jdbc.Driver");
 		String url="jdbc:mysql://localhost:3306/bus";
 		Connection con=DriverManager.getConnection(url,"root","12345");
 		String sql="insert into user1(name,phonenumber,password) values(?,?,?)";
 		PreparedStatement ps=con.prepareStatement(sql);
 		ps.setString(1,name);
 		ps.setString(2,phno);
 		ps.setString(3,password);
 		int r=ps.executeUpdate();
 		if(r>0) {
 			System.out.println("Successfully Registered");
 		}
 	}
 	catch(Exception e){
 		throw new RuntimeException("Wrong");
 	}
	}

}
