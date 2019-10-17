package com.pradeep;

import java.util.Calendar;
import java.util.Date;

public class TecholutionCalendar {
	static MyCalendar myCalendar = new MyCalendar();
	public static void main(String[] args) {
		System.out.println(myCalendar.getFirstDayOfMonth(5, 2019));
		System.out.println(myCalendar.getLastFriday(1, 2019));
	}

}

class MyCalendar {
	
	Date getLastFriday( int day, int year ) {
		Calendar cal = Calendar.getInstance();
		cal.set( year, 1, day);
		cal.add( Calendar.DAY_OF_MONTH, -( cal.get( Calendar.DAY_OF_WEEK ) % 7 + 1 ) );
		return cal.getTime();
	}
	
	Date getFirstDayOfMonth( int day, int year ) {
		Calendar cal = Calendar.getInstance();
		cal.set( year, 0, 5);
		cal.add( Calendar.DAY_OF_MONTH, +5 );
		return cal.getTime();
	}
}

