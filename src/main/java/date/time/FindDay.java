package date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FindDay {
	public static String getDay() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Date: ");
		String userDate = sc.nextLine();
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter1.parse(userDate);
		System.out.println("Day on 1st January: ");
		Scanner sc1 = new Scanner(System.in);
		String dayOn1Jan = sc1.nextLine();
		SimpleDateFormat formatter2 = new SimpleDateFormat("EEEE");
		String day = formatter2.format(date);
		System.out.println("Day on " + userDate + ": " + day);
		return day;
	}
}
