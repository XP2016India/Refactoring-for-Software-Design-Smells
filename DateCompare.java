import java.util.* ;
import java.time.*;

class DateCompare { 
	private static Date getCustomerBirthday() {
		// actual code will return customer birthday
		// hardcoded day here for simplification 
		return new Date(); 
	}
	public static void main(String []args) {
		Date today = new Date();
		System.out.println(today);
		Date customerBirthday = getCustomerBirthday();
		System.out.println(customerBirthday); 

		System.out.println(today.compareTo(customerBirthday) == 0); 
	}
}
