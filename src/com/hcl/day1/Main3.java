package com.hcl.day1;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the over");
		Long over = in.nextLong();
		System.out.println("Enter the ball");
		Long ball = in.nextLong();
		System.out.println("Enter the runs");
		Long runs = in.nextLong();
		in.nextLine();
		System.out.println("Enter the batsman name");
		String batsman = in.nextLine();
		System.out.println("Enter the bowler name");
		String bowler = in.nextLine();
		System.out.println("Enter the nonStriker name");
		String nonStriker = in.nextLine();

		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		d.displayDeliveryDetails();
		in.close();
	}

}
