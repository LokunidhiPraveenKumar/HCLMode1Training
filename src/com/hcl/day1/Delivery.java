package com.hcl.day1;

public class Delivery {
	Long over;
	Long ball;
	Long runs;
	String batsman;
	String bowler;
	String nonStriker;

	Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	public void displayDeliveryDetails() {
		System.out.println("Delivery Details :-");
		System.out.print("Over : " + over + "\n");
		System.out.print("Ball : " + ball + "\n");
		System.out.print("Runs : " + runs + "\n");
		System.out.print("Batsman : " + batsman + "\n");
		System.out.print("Bowler : " + bowler + "\n");
		System.out.print("NonStriker : " + nonStriker + "\n");
	}
}
