package com.hcl.day1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Venue v1 = new Venue();
		System.out.println("Enter the venue name");
		v1.name = input.nextLine();
		System.out.println("Enter the venue name");
		v1.city = input.nextLine();
		System.out.println("Venue Details :");
		System.out.println("Venue Name : " + v1.name);
		System.out.print("City Name : " + v1.city);
		input.close();

	}

}
