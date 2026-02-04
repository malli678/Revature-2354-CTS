import java.time.LocalDate;
import java.time.Period;
//Using Period (Days, Months, Years)
public class DatesDifference {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);

        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");

	}

}
