package date.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DaysYouAreAlive {
	public static long getDaysYouAreAlive() {
		LocalDate today= LocalDate.now();
		LocalDate birthday= LocalDate.of(1997, Month.NOVEMBER, 20);
		long noOfDays = ChronoUnit.DAYS.between(birthday, today);
		System.out.println(noOfDays);
		return noOfDays;
	}
}
