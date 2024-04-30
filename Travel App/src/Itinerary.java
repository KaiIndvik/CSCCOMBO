import java.sql.Date;
import java.util.Calendar;

public class Itinerary {

	
	private FlightReservation flightReservation;
	private HotelReservation hotelReservation;
	
	
	public Itinerary() {
	}


	public FlightReservation getFlightReservation() {
		return flightReservation;
	}


	public void setFlightReservation(String flightNumber, Calendar departDate, Calendar returnDate) {
		FlightReservation reservation = new FlightReservation(flightNumber,departDate,returnDate);
		this.flightReservation = reservation;
	}


	public HotelReservation getHotelReservation() {
		return hotelReservation;
	}


	public void setHotelReservation(String hotelName, String roomType, Calendar checkIn, Calendar checkOut) {
		HotelReservation reservation = new HotelReservation(hotelName, roomType, checkIn, checkOut);
		this.hotelReservation = reservation;
	}


	@Override
	public String toString() {
		return "Itinerary: \nFlight Reservation: " + flightReservation + "\nhotelReservation=" + hotelReservation + "]";
	}
	
	
	
	
	
	
}
