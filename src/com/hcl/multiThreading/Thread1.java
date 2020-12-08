package com.hcl.multiThreading;

import java.text.SimpleDateFormat;

public class Thread1 extends Thread {

	public void run() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		t1.setName("MyThread");
		System.out.println("Thread Name : " + t1.getName());
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss a");
		System.out.println(sdf.format(date));
		// sleep thread for 10 seconds
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		java.util.Date d1 = new java.util.Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("hh:MM:ss a");
		System.out.println(sdf1.format(d1));

	}

}
