
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/*****************************************************************************************
 * class Main 
 * Course: CST8130 
 * Name: Halima Ahmed 
 * Date: February 4,2019
 * Purpose:
 * 
 * 
 ***************************************************************************************/

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Router router = new Router();
		Packet packet = new Packet();

		File file = new File("Packets");

		try {

			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {

				String type = sc.next();

				packet.readPacket(sc.skip("[p,d]*"));
				router.processPacket(packet, type);
				sc.nextLine();

			}
			sc.close();

		} catch (NoSuchElementException e) {
		}
	}
}
