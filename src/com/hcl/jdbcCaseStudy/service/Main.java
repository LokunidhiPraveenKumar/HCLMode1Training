package com.hcl.jdbcCaseStudy.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.hcl.jdbcCaseStudy.model.User;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserService userService = new UserServiceImpl();
		int ch;
		do {
			System.out.println("MENU\n" + "1) Insert\n2) Update\n3) Select Single User\n4) Select All User\n"
					+ "5) Delect\n6) Exit");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter user details in CSV format(Name,Email,Country)");
				String st[] = sc.nextLine().split(",");
				userService.insertUser(new User(st[0], st[1], st[2]));
				break;

			case 2:
				System.out.println("Enter details of user you want to update");
				System.out.println("As follow ID,Name, Gmail, Country in CSV Format");
				String str[] = sc.nextLine().split(",");
				if (userService.updateUser((new User(Integer.parseInt(str[0]), str[1], str[2], str[3]))))
					System.out.println("Updated Sucessfully");
				else
					System.out.println("Update Failure!!!");
				break;
			case 3:
				System.out.println("Enter User ID want select");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Email", "Country");
				System.out.println(userService.selectUser(id));
				break;
			case 4:
				System.out.println("Displaying the all User Details:");
				System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Email", "Country");
				for (User u : userService.selectAllUses())
					System.out.println(u);
				break;
			case 5:
				System.out.println("Enter User ID to delete: ");
				int d = sc.nextInt();
				if (userService.deleteUser(d))
					System.out.println("Deleted record");
				else
					System.out.println("Record not deleted!!");
				break;
			}
		} while (ch != 6);

		sc.close();

	}
}