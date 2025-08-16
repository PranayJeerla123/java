package basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class D {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?);");
		int id=sc.nextInt();
		String name=sc.next();
		float sal=sc.nextFloat();
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setFloat(3, sal);
		ps.executeUpdate();
	}

}
