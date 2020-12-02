package com.hcl.day2;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Stall stall = new Stall();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the stall :");
		stall.setName(in.nextLine());
		System.out.println("Enter the detail of the stall :");
		stall.setDetail(in.nextLine());
		System.out.println("Enter the owner name of the stall :");
		stall.setOwnerName(in.nextLine());

		String stallType;
		System.out.println("Enter the type of the stall :");
		stallType = in.nextLine();
		int stallSqFeet;
		System.out.println("Enter the size of the stall in square feet :");
		stallSqFeet = in.nextInt();
		in.nextLine();
		System.out.println("Does the hall have TV? (y/n)");
		String ch = in.nextLine();
		if (ch.equalsIgnoreCase("y")) {
			System.out.println("Enter the number of TV :");
			int numOfTV = in.nextInt();
			System.out.println("The cost of the stall is " + stall.computeCost(stallType, stallSqFeet, numOfTV));
		} else {
			System.out.println("The cost of the stall is " + stall.computeCost(stallType, stallSqFeet));
		}
		in.close();
	}

}
