package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class B {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
		Statement st=con.createStatement();
		int id=sc.nextInt();
		String name=sc.next();
		float sal=sc.nextFloat();
		String sql="insert into emp values("+id+",'"+name+"',"+sal+");";
		System.out.print(st.executeUpdate(sql));
		st.close();
		con.close();
	}

}
