package com.hcl.multiThreading;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setDaemon(true);
		mt.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Daemon is " + isDaemon());
	}
}