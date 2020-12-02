package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class User2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int noOfUsers = in.nextInt();
		in.nextLine();
		List<User2> usersList = new ArrayList<>(noOfUsers);
		for (int i = 1; i <= noOfUsers; i++) {
			System.out.println("Enter the details of user " + i);
			String s[] = in.nextLine().split(",");
			usersList.add(new User2(s[0], s[1], s[2], s[3]));
		}
		Collections.sort(usersList);
		Collections.reverse(usersList);
		System.out.println("The user details in reverse order:");
		System.out.printf("%-15s%-15s\n", "Name", "Mobile Number");
		for (User2 u : usersList)
			System.out.println(u);
		in.close();
	}

}
