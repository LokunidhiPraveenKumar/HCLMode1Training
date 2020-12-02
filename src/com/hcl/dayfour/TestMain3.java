package com.hcl.dayfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		try {
			System.out.println("Enter an Integer input");
			num = sc.nextInt();
			System.out.println("Entered value is " + num);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
