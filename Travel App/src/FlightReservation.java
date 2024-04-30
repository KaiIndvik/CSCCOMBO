import java.sql.Date;
import java.util.Calendar;

public class FlightReservation {
	private String flightNumber;
	private Calendar departDate;
	private Calendar returnDate;
	
	
	
	public FlightReservation(String flightNumber, Calendar departDate, Calendar returnDate) {

		this.flightNumber = flightNumber;
		this.departDate = departDate;
		this.returnDate = returnDate;
	}
	
	



	@Override
	public String toString() {
		return "Flight Number:" + flightNumber + ", Departing flight: " + CalendarPrinter.betterCalendarToString(departDate) + ". Returing flight: "
				+ CalendarPrinter.betterCalendarToString(returnDate) + "]";
	}
	
	
	
	
}
