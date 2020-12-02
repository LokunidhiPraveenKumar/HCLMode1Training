package com.hcl.dayfive;

import java.util.Scanner;

public class MianTestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		UserBO userBO = UserBO.getList();
		System.out.println("Enter the number of User details to be added");
		int noOfUser = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= noOfUser; i++) {
			System.out.println("Enter the user " + i + " details in csv format");
			String[] details = in.nextLine().split(",");
			String name = details[0];
			String contactNumber = details[1];
			String userName = details[2];
			String email = details[3];
			User user = new User(name, contactNumber, userName, email);
			userBO.add(user);
		}
		display(userBO);
		System.out.println("Enter the range to be removed from array list");
		int lowerLimit = in.nextInt();
		int upperLimit = in.nextInt();
		userBO.removeUser(lowerLimit, upperLimit);
		display(userBO);
		in.close();

	}

	private static void display(UserBO userBO) {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "ContactNumber", "UserName", "Email");
		for (User u : userBO) {
			u.display();
		}
	}

}
