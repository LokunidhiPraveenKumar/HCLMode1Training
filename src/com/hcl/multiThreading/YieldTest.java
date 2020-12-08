package com.hcl.multiThreading;

public class YieldTest extends Thread {
	public void run() 
	    { 
	        System.out.println("In run "+this.getName()); 
	        yield(); 
	        System.out.println("Leaving run"); 
	    }

	public static void main(String[] argv) {
		(new YieldTest()).start();
		(new YieldTest()).start();
		(new YieldTest()).start();
	}
}