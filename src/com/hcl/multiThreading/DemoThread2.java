package com.hcl.multiThreading;

public class DemoThread2 extends Thread {

	public void run() {
		int counter = 1;
		System.out.println("Running child Thread in loop : "+this.getName());
		while (counter <= 10) {
			System.out.println(counter);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread2 m1 = new DemoThread2();
		m1.start();
		DemoThread2 m2 = new DemoThread2();
		m2.start();
		DemoThread2 m3 = new DemoThread2();
		m3.start();

	}

}
