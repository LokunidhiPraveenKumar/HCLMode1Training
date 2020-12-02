package com.hcl.dayfour;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		int costN = in.nextInt();
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		int costPerDay = 0;
		try {
			costPerDay = costN / n;
			System.out.println("Cost per day of the item is " + costPerDay);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		in.close();
	}

}
