package com.hcl.dayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		int i = 1;
		String choice;
		do {
			System.out.println("Enter username " + (i++));
			String name = sc.nextLine();
			names.add(name);
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Names entered are :");
		for (String name : names)
			System.out.println(name);
		sc.close();
	}

}
