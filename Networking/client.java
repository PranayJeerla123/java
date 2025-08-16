import java.net.*;
import java.io.*;
class Client{
	public static void main(String []args) throws Exception{
		Socket ss=new Socket("localhost",9999);
		DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
		dos.writeUTF("I am client");
		
		DataInputStream dis=new DataInputStream(ss.getInputStream());
		System.out.println(dis.readUTF());
		dis.close();
		dos.close();
		
	}
}