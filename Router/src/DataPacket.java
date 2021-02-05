
/*****************************************************************************************
 * class DataPacket
 
 ***************************************************************************************/
public class DataPacket extends Packet {
	
	public boolean processFoundPacket(String a){
		System.out.println("Sending packet out " + this.getPacketData() + " " + this.getDestNetwork() );
		return true;
	}
	public boolean processNotFoundPacket(String c){
		System.out.println("packet not sending out " + this.getPacketData() + " " + this.getDestNetwork() );
		return true;
	}
	public boolean processNotFoundPacket(String b) {
		System.out.println("Packet "+ this.getDestNetwork() +"is being dropped");
		return false;
	}
}
