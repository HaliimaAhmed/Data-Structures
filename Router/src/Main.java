
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/*****************************************************************************************
 * class Main 
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
