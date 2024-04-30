import java.sql.Date;
import java.util.Calendar;

public class TravelAgent {

//	Create a new project called Travel App.
//	Create a class named Itinerary, with data members Flight Reservation, and HotelReservation.
//	Create a class named FlightReservation, with data members flight number, flight date, flight time, return date, return time.
//	Create a class named HOtel Reservation, with data members HotelName, ROomType, room number. 
//	HotelReservation should have  a method called assignRoom that assigns a room between the numbers 1 and 67 randomly.
//	Create a driver class called TravelAgent.
//	Create a new itinerary with a flight and hotel reservation. 
//	Assign a room to the itinerary. 
	
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
		
		Itinerary itinerary1 = new Itinerary();
		Calendar departFlight = Calendar.getInstance();
		departFlight.set(2024,4,30,11,32);
		Calendar returnFlight = Calendar.getInstance();
		returnFlight.set(2024,5,30,11,32);
//		Date departFlight = (Date) cal.();
//		cal.set(2024,4,30,11,32);
//		Date returnFlight = (Date) cal.getTime();
		
		itinerary1.setFlightReservation("AMR-11",departFlight, returnFlight );
		
		System.out.println(itinerary1);
	}

}
