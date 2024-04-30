import java.util.Calendar;
import java.util.Random;

public class HotelReservation {
	
	private String hotelName;
	private String roomType;
	private int roomNumber;
	private Calendar checkIn;
	private Calendar checkOut;
	
	
	
	public HotelReservation(String hotelName, String roomType, Calendar checkIn, Calendar checkOut) {
		super();
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.roomNumber = assignRoom();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}



	private int assignRoom() {
		Random rand = new Random();
		return rand.nextInt(67) + 1;
	}



	@Override
	public String toString() {
		return "HotelReservation [hotelName=" + hotelName + ", roomType=" + roomType + ", roomNumber=" + roomNumber
				+ ", checkIn=" + CalendarPrinter.betterCalendarToString(checkIn) + ", checkOut=" + CalendarPrinter.betterCalendarToString(checkOut) + "]";
	}
	
	
}
