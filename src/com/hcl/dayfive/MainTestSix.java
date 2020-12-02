package com.hcl.dayfive;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainTestSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Set<String> userNames = new TreeSet<>();
		String choice;
		do {
			System.out.println("Enter UserName");
			userNames.add(in.nextLine());
			System.out.println("Do you want to continue ?(yes/no)");
			choice = in.nextLine();
		} while (choice.equalsIgnoreCase("YES"));
		System.out.println("Number of Users = " + userNames.size());
		System.out.println(userNames);
		in.close();
	}

}
