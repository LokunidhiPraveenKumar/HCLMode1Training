package com.hcl.daythree;

import java.util.Scanner;

public class FortTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What you want to visit");
		System.out.println("Rajmachi\n" + "Shivgadh\n" + "Murud");
		String choosenFort = in.next();
		Fort fort;
		if (choosenFort.equalsIgnoreCase("RAJMACHI")) {
			fort = new Rajmachi();
			fort.distance();
		} else if (choosenFort.equalsIgnoreCase("SHIVGADH")) {
			fort = new Shivgadh();
			fort.distance();
		} else if (choosenFort.equalsIgnoreCase("MURUD")) {
			fort = new Murud();
			fort.distance();
		}
	}
}
