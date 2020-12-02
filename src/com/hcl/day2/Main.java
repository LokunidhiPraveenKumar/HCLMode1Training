package com.hcl.day2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose Account Type");
		System.out.println("1. Saving Account\n" + "2. Curent Account");
		byte choice = in.nextByte();
		in.nextLine();
		if (choice == 1) {
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,"
					+ "Bank Name,Organisation Name)");
			String[] st = in.nextLine().split(",");
			Account savingacc = new SavingAccount(st[0], st[1], st[2], st[3]);
			savingacc.display();
		} else {
			System.out.println(
					"Enter Account details in comma " + "separated(Account Name,Account Number,Bank Name,TIN Number)");
			String[] st = in.nextLine().split(",");
			Account currentacc = new CurrentAccount(st[0], st[1], st[2], st[3]);
			currentacc.display();
		}
		in.close();
	}
}
