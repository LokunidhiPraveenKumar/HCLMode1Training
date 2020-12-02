package com.hcl.daythree;

import java.util.Scanner;

public class PolygonTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Breadth & Length Of Rectangle :");
		double length = in.nextDouble();
		double breadth = in.nextDouble();
		Polygon rectangle = new Rectangle(length, breadth);
		System.out.println("Enter Side Value : ");
		double side = in.nextDouble();
		Polygon square = new Square(side);
		System.out.println("Perimeter of Rectangle : " + rectangle.calcPeri());
		System.out.println("Area of Rectangle : " + rectangle.calcArea());
		System.out.println("Perimeter of Square : " + square.calcPeri());
		System.out.println("Area of Square : " + square.calcArea());
	}

}
