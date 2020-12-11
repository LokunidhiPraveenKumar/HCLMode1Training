package com.hcl.date;

import java.util.*;
import java.text.*;

public class DateExample {
	public static void main(String args[]) {
		Date date = new Date();
		System.out.println("Today's date is: " + date.toString());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("Today's date in formated way: " + dateFormat.format(date));
		
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String strdate2 = "02-04-2013 11:35:42";
		try {
			Date newdate = dateformat2.parse(strdate2);
			System.out.println(newdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = dateformat3.parse("17/07/1989");
			Date date2 = dateformat3.parse("15/10/2007");
			System.out.println("Date1 is: " + dateformat3.format(date1));
			System.out.println("Date2 is: " + dateformat3.format(date2));
			
			if (date1.after(date2)) {
				System.out.println("Date1 is later than Date2");
			} else if (date1.before(date2)) {
				System.out.println("Date1 is earlier than Date2");
			} else if (date1.equals(date2)) {
				System.out.println("Date1 is the same with Date2");
			}
			
			date1 = dateformat3.parse("27/09/2012");
			date2 = dateformat3.parse("27/09/2009");
			System.out.println("Date1 is: " + dateformat3.format(date1));
			System.out.println("Date2 is: " + dateformat3.format(date2));

			if (date1.compareTo(date2) > 0) {
				System.out.println("Date1 is later than Date2");
			} else if (date1.compareTo(date2) < 0) {
				System.out.println("Date1 is earlier than Date2");
			} else if (date1.compareTo(date2) == 0) {
				System.out.println("Date1 is the same with Date2");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}