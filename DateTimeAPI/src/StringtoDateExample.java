import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class StringtoDateExample {

	public static void main(String[] args) {
		// Parsing string to date
		String dateStr = "25-12-2026";

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println(date);

	}

}
