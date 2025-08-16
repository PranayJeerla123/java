package basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
		Statement st=con.createStatement();
		//String sql="insert into emp(id,name,salary) values(1,'Pranay',65000)";
//		String sql="delete from emp where id=1";
		//st.executeUpdate(sql);
		ResultSet rs=st.executeQuery("select * from emp;");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			float sal=rs.getFloat(3);
			System.out.println(id+" "+name+" "+sal);
		}
		
	}

}
