package com.hcl.day1;

import java.util.Scanner;

public class Test1 {

	public static void showVenueDeatils(Venue1 obj) {
		System.out.println("\n" + "Venue Details :");
		System.out.println("Venue Name : " + obj.getName());
		System.out.println("City Name : " + obj.getCity());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Venue1 v1 = new Venue1();
		System.out.println("Enter the venue name");
		String name = input.nextLine();
		v1.setName(name);
		System.out.println("Enter the City name");
		String city = input.nextLine();
		v1.setCity(city);
		showVenueDeatils(v1);
		byte temp;
		do {
			System.out.println("Verify and Update Venue Details \n" + "Menu");
			System.out.println("1. Update Venue Name \n" + "2. Update City Name \n"
					+ "3. All informations Correct/Exit \n" + "Type 1 or 2 or 3 ");
			temp = input.nextByte();
			input.nextLine();
			switch (temp) {
			case 1:
				System.out.println("Enter the venue name");
				String t = input.nextLine();
				v1.setName(t);
				showVenueDeatils(v1);
				break;
			case 2:
				System.out.println("Enter the City name");
				v1.setCity(input.nextLine());
				showVenueDeatils(v1);
				break;
			default:
				break;
			}
		} while (temp != 3);

		showVenueDeatils(v1);
		input.close();
	}

}
