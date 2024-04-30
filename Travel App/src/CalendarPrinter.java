import java.util.Calendar;

public class CalendarPrinter {
	
	public static String betterCalendarToString(Calendar calendar) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Year: ");
		sb.append(calendar.get(Calendar.YEAR));
		sb.append(", Month: ");
		sb.append(calendar.get(Calendar.MONTH));
		sb.append(", Day: ");
		sb.append(calendar.get(Calendar.DAY_OF_MONTH));
		sb.append(", Time: ");
		sb.append(calendar.get(Calendar.HOUR));
		sb.append(":");
		sb.append(calendar.get(Calendar.MINUTE));
		
		
		return sb.toString();
	}

}
