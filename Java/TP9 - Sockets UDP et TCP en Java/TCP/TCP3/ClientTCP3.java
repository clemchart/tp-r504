import java.io.*;
import java.net.*;

public class ClientTCP3
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 2016);
			DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
			DataInputStream dIn = new DataInputStream(socket.getInputStream());

			dOut.writeUTF(args[0]);

			String reponse = dIn.readUTF();
			System.out.println("Reponse (inversee): " + reponse);

			socket.close();
		}
		catch(Exception ex)
		{
			System.out.println("erreur !");
			ex.printStackTrace();
		}
	}
}