package com.hcl.dayfive;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Set<String> userNames = new TreeSet<String>();
		String choice;
		do {
			System.out.println("Enter the username");
			String name = in.nextLine();
			userNames.add(name);
			System.out.println("Do you want to continue?(Y/N)");
			choice = in.nextLine();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("The unique number of usernames is " + userNames.size());
		in.close();
	}

}
