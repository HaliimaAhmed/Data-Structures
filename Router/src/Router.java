import java.util.Arrays;
import java.util.Scanner;

/*****************************************************************************************
 * class Router
 ***************************************************************************************/
public class Router {
	
	private String routingTable[]= new String[1];
	private int maxEntries;
	private int numEntries;
	private int i,j;
	
	public Router(){

		 this.numEntries=0;
	}
	
	public void processPacket(Packet packet,String type) {

	
		if(type.equals("p"))	{
		
	
		if (routingTable.length > i) {
			String cheack ="Adding entry to routing table "+packet.getDestNetwork().toString();
            boolean result = Arrays.stream(routingTable).anyMatch(cheack::equals);
            if (result) {
         
            	routingTable[i] = packet.getDestNetwork().toString();
            }
            else if (result==false) {
            	routingTable[i] = "Adding entry to routing table "+packet.getDestNetwork().toString();
            }  
           
        }
		else if (routingTable.length <= i) {

            String newroutingTable[] = new String[routingTable.length + 1];
            System.arraycopy(routingTable, 0, newroutingTable, 0, routingTable.length);
            routingTable = newroutingTable;
            String cheack ="Adding entry to routing table "+packet.getDestNetwork().toString();
            boolean result = Arrays.stream(newroutingTable).anyMatch(cheack::equals);
           if (result) {
           String stamp= "Entry is already in the routing table "+packet.getDestNetwork().toString();
           newroutingTable[i] = stamp;
            }
            else {
                newroutingTable[i] = "Adding entry to routing table "+packet.getDestNetwork().toString();
            }  
           
        }
	}
		
		if(type.equals("d"))	{
			if (routingTable.length > i) {
				String cheack ="Adding entry to routing table "+packet.getDestNetwork().toString();
	            boolean result = Arrays.stream(routingTable).anyMatch(cheack::equals);
	            if (result) {
	         
	            	System.out.println("Sending packet out "+packet.getDestNetwork().toString());
	            	i--;
	            }
	            else if (result==false) {
	            	System.out.println("dropping packet...."+packet.getDestNetwork().toString());
	            	i--;
	            }  
	           
	        }
			else if (routingTable.length <= i) {

	            String cheack ="Adding entry to routing table "+packet.getDestNetwork().toString();
	            boolean result = Arrays.stream(routingTable).anyMatch(cheack::equals);
	           if (result) {
	          System.out.println("Sending packet out "+packet.getDestNetwork().toString());
	          i--;
	          // newroutingTable[i] = stamp;
	            }
	            else {
	              System.out.println("dropping packet...."+packet.getDestNetwork().toString());
	              i--;
	            }  
	           
	        }
			
			
		}
	

		 System.out.println(routingTable[i]);
	
		i++;


	 }
	
	public void displayTable() {
		System.out.println(routingTable.toString());
	}
}
