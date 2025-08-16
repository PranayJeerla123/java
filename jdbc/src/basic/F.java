package basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class F {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
	    PreparedStatement ps=con.prepareStatement("");
		ps.setString(1, sc.next());
		ps.setInt(2, sc.nextInt());
		System.out.println(ps.executeUpdate());
		ps.close();
		con.close();
	}

}
