import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime indiaTime =
	            ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

	        ZonedDateTime usTime =
	            ZonedDateTime.now(ZoneId.of("America/New_York"));

	        System.out.println(indiaTime);
	        System.out.println(usTime);
	}

}
