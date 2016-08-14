import java.time.*;

class JavaTimePackage {
	public static void main(String []args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
	
		LocalTime now = LocalTime.now();
		System.out.println(now); 

		ZoneId id = ZoneId.of("Asia/Tokyo");
		System.out.println(id); 

		LocalDateTime todayAndNow = LocalDateTime.now();
		System.out.println(todayAndNow); 

		ZonedDateTime todayAndNowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo")); 
		System.out.println(todayAndNowInTokyo); 
	}
}
