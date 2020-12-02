package com.hcl.day1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the extratype Details");
		String[] st = in.nextLine().split("#");
		ExtraType obj = new ExtraType();
		obj.setName(st[0]);
		obj.setRuns(Long.parseLong(st[1]));
		System.out.println("ExtraType Details");
		System.out.println("Extra Type : " + obj.getName());
		System.out.println("Runs : " + obj.getRuns());
		in.close();
	}
}
