import java.time.LocalDate;
import java.time.LocalTime;

import java.time.LocalDateTime;

public class LocalDateTimeAPIDemo {

	public static void main(String[] args) {
//		LocalDate (Date only)
//		Example: Get today’s date
		LocalDate today = LocalDate.now();
		System.out.println(today); // 2026-01-23
		
		//Create a specific date
		LocalDate birthday = LocalDate.of(2000, 5, 10);
		System.out.println(birthday); // 2000-05-10
		
		//LocalTime (Time only) = current time
		LocalTime time = LocalTime.now();
        System.out.println(time); // 10:42:51.677619500
        
        // Create custom time
        
        LocalTime meetingTime = LocalTime.of(14, 30);
        System.out.println(meetingTime); // 14:30
        
        // Add or subtract time
        
        LocalTime time1 = LocalTime.now();
        System.out.println(time1.plusHours(2)); // 12:44:32.186479
       
        System.out.println(time1.minusMinutes(15)); // 10:29:32.186479
        
        // LocalDateTime (Date + Time)
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2026-01-23T10:46:12.105259200
        
        // Custom date & time
        
        LocalDateTime exam = LocalDateTime.of(2026, 3, 15, 9, 0);
        System.out.println(exam); // 2026-03-15T09:00

	}

}
