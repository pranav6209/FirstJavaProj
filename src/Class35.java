import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Class35 {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException, ParseException {

		// /////////////////////////////////////
		/* Date */

		// Date date = new Date();
		//
		// System.out.println(date);
		//
		// // to display in particular format.
		// // MM for month
		//
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//
		// SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		//
		// String str = dateFormat.format(date);
		//
		// String str1 = timeFormat.format(date);
		//
		// System.out.println(str);
		//
		// System.out.println(str1);
		// /////////////////////////////////////////////////////

		/* Calendar */

		// SimpleDateFormat dateFormat = new SimpleDateFormat(
		// "dd/MM/yyyy HH:mm:ss");
		//
		// Calendar calender = Calendar.getInstance();
		//
		// String str = dateFormat.format(calender.getTime());
		//
		// System.out.println(str);
		// // what is era not sure. Gregorian calender starts with 0
		// System.out.println("ERA: " + calender.get(calender.ERA));
		// System.out.println("YEAR: " + calender.get(calender.YEAR));
		// System.out.println("MONTH: " + calender.get(calender.MONTH));
		//
		// To supply a date.

		Calendar calender = new GregorianCalendar(2014, 05, 20);

		// we can add to month, date and year 
		calender.add(calender.MONTH,1);

		System.out.println("ERA: " + calender.get(calender.ERA));
		System.out.println("YEAR: " + calender.get(calender.YEAR));
		System.out.println("MONTH: " + calender.get(calender.MONTH));
		System.out.println("MONTH: " + calender.get(calender.DAY_OF_MONTH));

	}
}
