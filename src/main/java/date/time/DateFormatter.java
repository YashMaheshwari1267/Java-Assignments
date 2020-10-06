package date.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatter {
	public static String getDateSeparatedBySlash() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any date in 8 digits (ddmmyyyy) format: ");
		String userDate = sc.nextLine();
		SimpleDateFormat formatter1 = new SimpleDateFormat("ddMMyyyy");
		Date date = formatter1.parse(userDate);
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
		String newDate = formatter2.format(date);
		System.out.println("Date in dd/MM/yyyy format" + newDate);
		return newDate;
	}

	public static String getDateSInEnglishFormat() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any date in 8 digits (ddmmyyyy) format: ");
		String userDate = sc.nextLine();
		SimpleDateFormat formatter1 = new SimpleDateFormat("ddMMyyyy");
		Date date = formatter1.parse(userDate);
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd MMMM, yyyy");
		String newDate = formatter2.format(date).toUpperCase();
		System.out.println("Date in dd MMMM, yyyy format" + newDate);
		return newDate;
	}
}
