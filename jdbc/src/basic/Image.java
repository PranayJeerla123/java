package basic;
import java.io.FileInputStream;
import java.sql.*;
import java.util.*;
public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
			String sql="insert into profile values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			FileInputStream fis=new FileInputStream("C:\\Users\\prana\\Music\\sunrisers.png");
			ps.setBinaryStream(3,fis);
			System.out.println(ps.executeUpdate());
			fis.close();
			ps.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

