
/*****************************************************************************************
 * Class: RoutingTableEntry
 
 ***************************************************************************************/
import java.util.*;

public class RoutingTableEntry {
	
	private IPAddress destination;
	private String portCode;
	
	//Default constructor
	public RoutingTableEntry(){
		
		this.destination = destination;
		this.portCode = portCode;

	}
	//addEntry – to update the information in the current object from the parameters passed into the method
	public void addEntry(IPAddress ipa, String portCode){
		
		this.destination = ipa;
		this.portCode = portCode;
	}
	//toString – to display this entry to a String
	public String toString() {
		
		return " " + destination + " " + portCode;
	}
	
	
	//searchForPort – to compare the destination IP Address in parameter to this entry to see if they match, 
	//and if they do, send back portCode; or send back "" (empty String) if they don’t match.  
	//This will be used to process data packets in the input and determine which port they should continue out of.

	public String searchForPort(IPAddress ipa) {
		
		if (ipa.equals(this.destination)) {
		
			return portCode;
		}else {
			return "";
		}
	}
	
}
