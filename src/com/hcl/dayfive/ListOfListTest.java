package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<ArrayList<Integer>> dayShowList = new ArrayList<ArrayList<Integer>>(5);
		System.out.println("Enter the count of booked tickets:");

		for (byte i = 1; i <= 5; i++) {
			ArrayList<Integer> showList = new ArrayList<>(4);
			System.out.println("On Day " + i);
			String st[] = in.nextLine().split(",");
			for (byte j = 0; j < 4; j++)
				showList.add(100 - Integer.parseInt(st[j]));
			dayShowList.add(showList);
		}
		String choice;
		do {
			System.out.println("Enter the day to know its remaining ticket count:");
			byte remainingTickets = in.nextByte();
			in.nextLine();
			System.out.println("Remaining tickets:" + dayShowList.get(remainingTickets - 1));
			System.out.println("Do you want to continue?(y/n)");
			choice = in.nextLine();
		} while (choice.equalsIgnoreCase("Y"));

		in.close();
	}
}