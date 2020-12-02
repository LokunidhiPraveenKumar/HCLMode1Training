package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<String> hallNames = new ArrayList<>();
		System.out.println("Enter the number of halls :");
		int noOfHalls = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= noOfHalls; i++) {
			System.out.println("Enter the Hall Name" + i);
			hallNames.add(in.nextLine());
		}
		System.out.println("Enter the hall name to be searched :");
		String searchHall = in.nextLine();
		if (hallNames.contains(searchHall)) {
			System.out.println(
					searchHall + " hall is found in the list at position " + (hallNames.indexOf(searchHall) + 1));
		} else {
			System.out.println(searchHall + " hall is not found");
		}
		in.close();

	}

}
