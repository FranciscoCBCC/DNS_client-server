package DNS;



import java.net.*;

class dns
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			InetAddress[] address=InetAddress.getAllByName("127.0.0.1");
			for(int j=0;j<address.length;j++)
			System.out.println(address[j]);
		}
 
		catch(Exception e)
		{
			System.out.println("Error in accessing Internet :"+e);
		}
	}
}