package com.hcl.innerclass;

public class MotherBoardMain {
	public static void main(String[] args) {

		// create an object of the static nested class
		// using the name of the outer class
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.println("Total Ports = " + usb.getTotalPorts());
	}
}
