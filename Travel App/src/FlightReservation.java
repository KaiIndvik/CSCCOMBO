import java.sql.Date;
import java.util.Calendar;

public class FlightReservation {
	private String flightNumber;
	private Calendar flightDate;
	private Calendar returnDate;
	
	
	
	public FlightReservation(String flightNumber, Calendar flightDate, Calendar returnDate) {

		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.returnDate = returnDate;
	}



	@Override
	public String toString() {
		return "FlightReservation [flightNumber=" + flightNumber + ", flightDate=" + flightDate.get + ", returnDate="
				+ returnDate + "]";
	}
	
	
	
	
}
