import java.net.*;
import java.io.*;
class Server{
	public static void main(String []args)throws Exception{
		ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());

		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF("I am Server");
		dos.close();
		dis.close();
		
	}
}