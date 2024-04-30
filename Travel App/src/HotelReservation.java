import java.util.Random;

public class HotelReservation {
	
	private String hotelName;
	private String roomType;
	private int roomNumber;
	
	private int assignRoom() {
		Random rand = new Random();
		return rand.nextInt(67) + 1;
	}
}
