package com.hcl.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String dateString = sdf.format(date);
		System.out.println("Date in the format of MM-dd-yyyy : " + dateString);

		sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		dateString = sdf.format(date);
		System.out.println("Date in the format of dd/MM/yyyy hh:mm:ss : " + dateString);

		sdf = new SimpleDateFormat("dd, MMMM, yyyy");
		dateString = sdf.format(date);
		System.out.println("Date in the format of dd, MMMM, yyyy : " + dateString);

		sdf = new SimpleDateFormat("dd, MMMM, yyyy zzzz");
		dateString = sdf.format(date);
		System.out.println("Date in the format of dd, MMMM, yyyy zzzz : " + dateString);

		sdf = new SimpleDateFormat("E, dd/MMM/yyyy HH:mm:ss z");
		dateString = sdf.format(date);
		System.out.println("Date in the format of E, dd/MMM/yyyy HH:mm:ss z : " + dateString);

		sdf = new SimpleDateFormat("dd MMM yyyy z");
		dateString = sdf.format(date);
		System.out.println("Date in the format of dd MMM yyyy z : " + dateString);
	}
}
