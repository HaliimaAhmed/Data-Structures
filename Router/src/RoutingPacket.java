import java.util.Scanner;
/*****************************************************************************************
 * class RoutingPacket
 
 ***************************************************************************************/
public class RoutingPacket extends Packet{
	
	public boolean processFoundPacket(String found) {
		
		System.out.println("entry is already in the table"+ " " + this.getDestNetwork());
		
		return true;
	}
	public boolean processNotFoundPacket(String notFound) {
		
		System.out.println("Adding entry to routing  " + this.getDestNetwork() + " " + this.getPacketData() + " to routing table" );
		
		return true;
	}
}
