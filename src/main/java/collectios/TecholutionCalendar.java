package collectios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.stream.IntStream;

public class TecholutionCalendar {
	static MyCalendar myCalendar = new MyCalendar();
	public static void main(String[] args) {
		myCalendar.displayPayoutFridaysForYear(2019);
	}

}

class MyCalendar {
	
	
	void displayPayoutFridaysForYear(int year) {
	   Calendar cal = Calendar.getInstance();
	   System.out.println("Displaying last fridays for year : "+ year);
	   IntStream.rangeClosed(1, 12).forEachOrdered(month -> lastFridayForMonth(cal, year, month));
	}

	private void lastFridayForMonth(Calendar cal, int year, int month) {
		cal.set( year, month, 1 );
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println( cal.get( Calendar.DAY_OF_WEEK ) % 7 + 1 );
		   cal.add( Calendar.DAY_OF_MONTH, -( cal.get( Calendar.DAY_OF_WEEK ) % 7 + 1 ) );
		   System.out.println(new SimpleDateFormat("MMMMM").format(cal.getTime()) +" - "+ cal.get(Calendar.DAY_OF_MONTH));
	}
}

