// Using Duration (Hours, Minutes, Seconds)
import java.time.Duration;
import java.time.LocalTime;

public class DurationDifference {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(14, 30);

        Duration duration = Duration.between(start, end);

        System.out.println(duration.toHours()); // 4
        System.out.println(duration.toMinutes()); // 270

	}

}
