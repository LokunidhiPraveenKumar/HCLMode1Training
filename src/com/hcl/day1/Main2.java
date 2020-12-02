package com.hcl.day1;

import java.util.Scanner;

public class Main2 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Player name");
		String name = in.nextLine();
		System.out.println("Enter the Country name");
		String country = in.nextLine();
		System.out.println("Enter the Skill");
		String skill = in.nextLine();
		Player p = new Player(name, country, skill);
		System.out.println("Player Details :");
		System.out.println("Player Name : " + p.name);
		System.out.print("Country Name : " + p.country + "\n");
		System.out.println("Skill : " + p.skill);
		in.close();

	}

}
