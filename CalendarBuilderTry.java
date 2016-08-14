import static java.util.Calendar.*;
import java.util.*;

class CalendarBuilderTry {
	public static void main(String []args) {
		Calendar calendar = new Calendar.Builder()
			.set(YEAR, 2003)
			.set(MONTH, APRIL)
			.set(DATE, 6)
			.set(HOUR, 15)
			.set(MINUTE, 45)
			.set(SECOND, 22)
			.setTimeZone(TimeZone.getDefault())
			.build();
			System.out.println(calendar); 
	}
}
