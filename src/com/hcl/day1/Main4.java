package com.hcl.day1;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Player Details");
		String[] st = in.nextLine().split(",");
		Player p1 = new Player(st[0], st[1], st[2]);
		System.out.println("Player Details :- ");
		System.out.println("Player Name : " + p1.name);
		System.out.println("Country Name : " + p1.country);
		System.out.println("Skill : " + p1.skill);
		in.close();
	}
}
