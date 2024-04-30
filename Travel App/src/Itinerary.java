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


	public void setFlightReservation(String flightNumber, Calendar flightDate, Calendar returnDate) {
		FlightReservation reservation = new FlightReservation(flightNumber,flightDate,returnDate);
		this.flightReservation = reservation;
	}


	public HotelReservation getHotelReservation() {
		return hotelReservation;
	}


	public void setHotelReservation(HotelReservation hotelReservation) {
		this.hotelReservation = hotelReservation;
	}


	@Override
	public String toString() {
		return "Itinerary [flightReservation=" + flightReservation + ", hotelReservation=" + hotelReservation + "]";
	}
	
	
	
	
	
	
}
