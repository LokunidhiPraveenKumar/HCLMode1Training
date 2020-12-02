package com.hcl.day1;

import java.util.Scanner;

public class Test3 {

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
		Delivery1 obj = new Delivery1(over, ball, runs, batsman, bowler, nonStriker);

		System.out.println("Delivery Details :-");
		System.out.println("Over : " + obj.getOver());
		System.out.println("Ball : " + obj.getBall());
		System.out.println("Runs : " + obj.getRuns());
		System.out.println("Batsman : " + obj.getBatsman());
		System.out.println("Bowler : " + obj.getBowler());
		System.out.println("NonStriker : " + obj.getNonStriker());
		in.close();

	}

}
