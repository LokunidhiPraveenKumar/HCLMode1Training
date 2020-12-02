package com.hcl.day2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AccountBO accBO = new AccountBO();
		System.out.println("Enter account details :");
		String acDetails = in.nextLine();
		FixedAccount2 fixedAC = accBO.getAccountDetails(acDetails);
		// System.out.println("Account Number\tBalance\tAccount Holder Name"
		// + "Minimum Balance\tLocking Period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s", fixedAC.getAccountNumber(), fixedAC.getBalance(),
				fixedAC.getAccountHolderName(), fixedAC.getMinimumBalance(), fixedAC.getLockingPeriod());
		in.close();
	}
}
