package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<ItemType> itemTypes = new ArrayList<>();
		String choice;
		byte i = 1;
		do {
			System.out.println("Enter the details of Item Type " + (i++));
			System.out.println("Name :");
			String name = in.nextLine();
			System.out.println("Deposit");
			Double deposit = Double.parseDouble(in.nextLine());
			System.out.println("Cost Per Day");
			Double cost = Double.parseDouble(in.nextLine());
			itemTypes.add(new ItemType(name, deposit, cost));
			System.out.println("Do you want to continue?(y/n)");
			choice = in.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println(String.format("\n%-20s%-20s%-20s", "Name", "Deposit", "CostPerDay"));
		for (ItemType item : itemTypes)
			System.out.println(item);
		in.close();
	}

}
