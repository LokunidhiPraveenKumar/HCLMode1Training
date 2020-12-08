package com.hcl.multiThreading;

public class NumberMulitiplication implements Runnable {
	private int number;

	public NumberMulitiplication(int number) {
		this.number = number;
	}

	@Override
	public void run() {

		System.out.println("Thread displaying the multiplies of " + number);
		int i = 1;
		while (i <= 10) {
			System.out.println(this.number * i);
			i++;
		}
		System.out.println("Multiplies of " + number + " are stopped");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new NumberMulitiplication(2));
		Thread t2 = new Thread(new NumberMulitiplication(5));
		Thread t3 = new Thread(new NumberMulitiplication(8));
		try {
			System.out.println(t1.getName() + " Running :");
			t1.start();
			t1.join();
			System.out.println(t1.getName() + " Stopped");
			System.out.println(t2.getName() + " Running :");
			t2.start();
			t2.join();
			System.out.println(t2.getName() + " Stopped");
			System.out.println(t3.getName() + " Running :");
			t3.start();
			t3.join();
			System.out.println(t3.getName() + " Stopped");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
