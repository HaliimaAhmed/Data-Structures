import java.util.NoSuchElementException;
import java.util.Scanner;

/*****************************************************************************************
 * class Packet
 
 ***************************************************************************************/
public class Packet {
	
	private IPAddress SourceAddress;
	private IPAddress destinationAddress;
	private String packetData;
	
	//Default constructor
	public Packet() {
		
		this.SourceAddress = new IPAddress();
		this.destinationAddress = new IPAddress();
		this.packetData  = new String();	
	}
	 //readPacket from Scanner parameter passed in, 
	//returning a boolean to indicate good data was read (or not)
	
	public boolean readPacket(Scanner inFile) {
		//System.out.println(inFile.nextLine());
		//System.out.println(this.destinationAddress.readAddress(inFile));
		try {
			
		boolean valid = this.destinationAddress.readAddress(inFile); 
		boolean valid2 = this.SourceAddress.readAddress(inFile);
	
		this.packetData = inFile.next();
		}
catch(NoSuchElementException e) {
			
		}
	
		
	
		return true;
	}
	//returns the network IPAddress of the destination address
	public IPAddress getDestNetwork() {
		
		return destinationAddress.getNetwork();
		
	}
	
	//which does the action needed if destination IP address
	//of the packet is found in the routing table
	public boolean processFoundPacket(String found) {
		 
		
		
		return true;
		
	}
	//which does the action needed if destination IP address 
	//of the packet is not found in the routing 
	public boolean processNotFoundPacket(String a) {
		
		return true;
		
	}
	//which returns the packetData String
	public String getPacketData(){
		
		return packetData;
		
	}
}
