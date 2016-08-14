import java.util.* ;
import java.time.*;

class LocalDateCompare { 
	private static LocalDate getCustomerBirthday() {
		// actual code will return customer birthday
		// hardcoded day here for simplification 
		return LocalDate.now(); 
	}
	public static void main(String []args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate customerBirthday = getCustomerBirthday();
		System.out.println(customerBirthday);
		System.out.println(today.compareTo(customerBirthday) == 0); 
	}
}
