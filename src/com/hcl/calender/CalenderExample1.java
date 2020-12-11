package com.hcl.calender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderExample1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("The current date is : " + cal.getTime());
		cal.add(Calendar.DATE, -15);
		System.out.println("15 days ago: " + cal.getTime());
		cal.add(Calendar.MONTH, 4);
		System.out.println("4 months later: " + cal.getTime());
		cal.add(Calendar.YEAR, 2);
		System.out.println("2 years later: " + cal.getTime());
		cal = Calendar.getInstance();
		// Example 1 - get the year from Calendar
		System.out.println("Year : " + cal.get(Calendar.YEAR));
		// Example 2 - get the month from Calendar
		System.out.println("Month : " + cal.get(Calendar.MONTH));
		// Example 3 - get the Day of month from Date and Calendar
		System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));
		// Example 4 - get the Day of Week from Date
		System.out.println("Day of Week : " + cal.get(Calendar.DAY_OF_WEEK));
		// Example 5 - get the Day of year from Date
		System.out.println("Day of Year : " + cal.get(Calendar.DAY_OF_YEAR));
		// Example 6 - get the Week of Year from Calendar
		System.out.println("Week of Year : " + cal.get(Calendar.WEEK_OF_YEAR));
		// Example 7 - get the Week of Month from Date
		System.out.println("Week of Month : " + cal.get(Calendar.WEEK_OF_MONTH));
		// Example 8 - get the hour from time
		System.out.println("Hour : " + cal.get(Calendar.HOUR));
		// Example 9 - get the AM PM from time
		System.out.println("AM PM : " + cal.get(Calendar.AM_PM));
		// Example 10 - get the hour of the day from Calendar
		System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));
		// Example 11 - get the minute from Calendar
		System.out.println("Minute : " + cal.get(Calendar.MINUTE));
		// Example 12 - get the Second from Calendar
		System.out.println("Second : " + cal.get(Calendar.SECOND));
		System.out.println();
		// Example 13 - converting Date to Calendar
		Date date = new Date();
		Calendar cal1 = Calendar.getInstance();
		cal.setTime(date);
		// Example 14 - Creating GregorianCalendar of specific date
		Calendar cal2 = new GregorianCalendar(2016, Calendar.JUNE, 21);
		// Example 15 - Converting Calendar to Date
		Date d = cal2.getTime();
		System.out.println("date from Calendar : " + d);
		// Example 16 - adding 1 day into date
		cal2.add(Calendar.DAY_OF_MONTH, 1);
		d = cal2.getTime();
		System.out.println("date after adding one day (tommorrow) : " + d);
		// Example 17 - subtracting a day from day
		cal2.add(Calendar.DAY_OF_MONTH, -2);
		d = cal2.getTime();
		System.out.println("date after subtracting two day (yesterday) : " + d);

	}
}