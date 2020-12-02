package com.hcl.daythree;

import java.util.Scanner;

public class CarServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your car number");
		int carNum = in.nextInt();
		System.out.println("How many years old car do you have");
		int years = in.nextInt();
		in.nextLine();
		System.out.println("Car Brand");
		String brand = in.next();
		Car car = new Service(carNum, brand, years);
		car.sum();
		car.brand();
		car.years();
		in.close();
	}
}
