package date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FutureDate {
	public static String getFutureDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in (dd/mm/yyyy) format: ");
		String enteredDate = sc.nextLine();
		Date date;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		try {
			date = formatter.parse(enteredDate);
			System.out.println("Entered Date: " + enteredDate);
			System.out.println("Enter number of days after which future date is to be found: ");
			Scanner sc1 = new Scanner(System.in);
			int days = sc1.nextInt();
			sc1.close();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			String futureDate = formatter.format(cal.getTime());
			System.out.println(futureDate);
			return futureDate;
		} catch (Exception e) {
			System.out.println("Please enter a valid date / Check Format");
			return null;
		} finally {
			sc.close();
		}
	}

}
