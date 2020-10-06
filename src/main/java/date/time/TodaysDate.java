package date.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodaysDate {
	public static String getTodaysDate() {
		Date date = new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("EEEE MMMM dd yyyy");
		String temp = formatter.format(date); 
		String []s= temp.split(" ");
		return s[0]+", "+s[1]+" "+s[2]+", "+s[3];
	}
}
