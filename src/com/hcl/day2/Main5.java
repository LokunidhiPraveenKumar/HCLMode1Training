package com.hcl.day2;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter type of Event \n1. Exhibition \n2. Stage Event");
		byte choice = in.nextByte();
		in.nextLine();
		if (choice == 1) {
			System.out.println("Enter Exhibition Details");
			String[] st = in.nextLine().split(",");
			Event exhibitionEvent = new Exhibition(st[0], st[1], st[2], Integer.parseInt(st[3]));
			exhibitionEvent.displayEventDetails();
		} else if (choice == 2) {
			System.out.println("Enter Stage Event Details");
			String[] st = in.nextLine().split(",");
			Event stageEvent = new StageEvent(st[0], st[1], st[2], Integer.parseInt(st[3]), Integer.parseInt(st[4]));
			stageEvent.displayEventDetails();
		} else {
			System.out.println("Invalid Choice");
		}
		in.close();

	}

}
