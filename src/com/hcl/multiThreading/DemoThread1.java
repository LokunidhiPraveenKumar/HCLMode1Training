package com.hcl.multiThreading;

public class DemoThread1 implements Runnable {
	public DemoThread1() {
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Running child Thread in loop : ");
		int counter = 1;
		while (counter <= 10) {
			System.out.println(counter);
			counter++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread1 m1 = new DemoThread1();
		DemoThread1 m2 = new DemoThread1();
		DemoThread1 m3 = new DemoThread1();

	}

}
