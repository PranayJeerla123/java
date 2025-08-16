/* create a jdbc application where we need to retrive image from the table*/
package basic;
import java.util.*;
import java.sql.*;
import java.io.*;
public class Image2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
			String sql="select * from profile";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			FileOutputStream fos=new FileOutputStream("C:\\Users\\prana\\Music\\srh3.png");
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			Blob b=rs.getBlob(3);
			byte[] by=b.getBytes(1, (int)b.length());
			fos.write(by);
			fos.close();
			ps.close();
			con.close();
			System.out.println("Done");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
/*Create a jdbc application where we need to retrive data from an existing table by storing the database details
 * in external file like properties */
