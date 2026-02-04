import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = now.format(formatter);
        System.out.println(formattedDate);
	}

}

/*
 * Pattern cheatsheet

dd → day

MM → month

yyyy → year

HH → hour (24h)

mm → minutes

ss → seconds
*/