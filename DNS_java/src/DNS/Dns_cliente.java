package DNS;

import java.io.*;
import java.net.*;
import java.util.*;

public class Dns_cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			DatagramSocket cliente=new DatagramSocket();
			InetAddress addr=InetAddress.getByName("127.0.0.1");

			byte[] sendbyte=new byte[1024];
			byte[] receivebyte=new byte[1024];
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Entre com o NOME DO DOM�NIO ou um ENDERE�O IP:");
			String str=in.readLine();
			sendbyte=str.getBytes();
			DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,addr,1309);
			cliente.send(sender);
			DatagramPacket receiver=new DatagramPacket(receivebyte,receivebyte.length);
			cliente.receive(receiver);
			String s=new String(receiver.getData());
			System.out.println("Endere�o IP ou Nome do Dom�nio: "+s.trim());   
			cliente.close();
        }
        catch(Exception e){
        	System.out.println(e);
        }
	}
}
