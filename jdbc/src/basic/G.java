package basic;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class G {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
		PreparedStatement ps=con.prepareStatement("delete from emp where id=?");
		
		ps.setInt(1, sc.nextInt());
		System.out.println(ps.executeUpdate());
	}

}
