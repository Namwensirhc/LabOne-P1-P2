package labOneP2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class labOneP2 {
	/*
	 * Task: Write a Java console application to calculate the duration between two
	 * dates in Years, Months and Days. The user should enter two dates as input,
	 * then the program will show the result of the difference in time between these
	 * two dates.
	 * 
	 * I wrote this one pretty quick using some code and imports i found online but
	 * kept getting numbers way off from what i should have
	 */
	static Scanner scan = new Scanner(System.in);
	static int month1;
	static int month2;
	static int day1;
	static int day2; // again i put all variables above methods to make calling them easier
	static int year1;
	static int year2;
	static String date1;
	static String date2;
	// SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	static SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

	public static void main(String[] args) {
// again I didnt put much in the main and kept it simple so it would be easy to reset with
		System.out.println(
				"Hello User, I am Datebot. I will aid you in finding the amouunt of time that has passed between two dates.");
		inputs();
	}

// i originally asked for the date without any "/" marks but I later found out the formatter can actually read the date if someone did enter it with "/"'s
	public static void inputs() {
		System.out.println("The first input I will need from you is a starting date in MM/dd/yyyy format:");
		System.out.println(
				"For example: If the first date you would like to enter is January 1st, 1994 you would enter 01/01/1994.");
		date1 = scan.nextLine();

		System.out.println(" Thank you, Please now input the second date in the same format as before:");

		date2 = scan.nextLine();
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		computations();
	}

	public static void computations() {
		try { // this was my first use of parse and I still dont completely get how it works,
				// Mostly just fiddled with it a lot using trial and error
			Date startDate = formatter.parse(date1);

			Date endDate = formatter.parse(date2);

			long diffInMilliSec = (endDate.getTime() - startDate.getTime());
//I found this equation online as well. At first i thought milliseconds would be to small but after testing some inputs the math seemed to work out. My biggest problem finding and running code in this was trusting Java to know the dates and account for leap years and such
			long days = (diffInMilliSec / (1000 * 60 * 60 * 24)); // % 365;
			long months = ((days / 365) / 12);
			double days2 = (months % 12);
			long years = (days / 365);
			// long years = (diffInMilliSec / (1000 * 60 * 60 * 24 * 365));
//It was here that I realized that i could get years and days but didnt have  months!
			// so i made some more variables above and tried to get years months and days
			// all by using the milliseconds converted to days. In the end i couldn't figure
			// it out, If you take months out of the system print it gives the right years
			// and days but when i try to split those days into months it either comes out
			// wrong or the days left over disappear even when i use %. I hope this is okay
			// I really didnt notice I was accounting for months till i was trying to fix
			// errors in the code i did have.
			System.out.println("Difference is ---> ");
			System.out.println((years + " years and " + months + " months and " + days2 + " days"));

		} catch (ParseException e) {
			e.printStackTrace();
		} // I still don't know what this e means but I kept seeing it online and it
			// worked so yeah idk.
	}
}
