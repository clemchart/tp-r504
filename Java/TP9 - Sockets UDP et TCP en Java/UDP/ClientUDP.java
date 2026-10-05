import java.net.*;

public class ClientUDP
{
	public static void main(String[] args)
	{
		try
		{
			InetAddress addr = InetAddress.getByName("localhost");
			System.out.println("adresse=" + addr.getHostName());

			String s = "Hello World";
			byte[] data = s.getBytes();

			DatagramSocket sock = new DatagramSocket();

			DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
			sock.send(packet);
			System.out.println("Message envoye");

			DatagramPacket reponse = new DatagramPacket(new byte[1024], 1024);
			sock.receive(reponse);

			String str = new String(reponse.getData(), 0, reponse.getLength());
			System.out.println("Reponse du serveur: " + str);

			sock.close();
		}
		catch(Exception ex)
		{
			System.out.println("erreur !");
			ex.printStackTrace();
		}
	}
}