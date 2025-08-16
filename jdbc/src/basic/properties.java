package basic;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\prana\\Music\\java\\jdbc\\database.properties");
			Properties p=new Properties();
			p.load(fis);
			String drivername=p.getProperty("drivername");
			String url=p.getProperty("url");
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			Class.forName(drivername);
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
