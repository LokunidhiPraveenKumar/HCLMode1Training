package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class User1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<User1> userList = new ArrayList<>();
		System.out.println("Enter the number of user details");
		int noOfUsers = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= noOfUsers; i++) {
			System.out.println("Enter the User " + i + " details");
			String[] st = in.nextLine().split(",");
			userList.add(new User1(st[0], st[1], st[2], st[3]));
		}
		byte choice;
		do {
			System.out.println("Sort by\n1. Name\n2. Email");
			choice = in.nextByte();
			if (choice == 1) {
				Collections.sort(userList, new NameComparator());
			} else if (choice == 2) {
				Collections.sort(userList, new EmailComparator());
			} else {
				System.out.println("Exited");
				break;
			}
			System.out.printf("%-15s %-15s %-15s %s\n", "Name", "Email", "UserName", "Password");
			for (User1 u : userList)
				System.out.println(u);
		} while (true);
		in.close();
	}
}