package com.hcl.java8Interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String... args) {
		Supplier<Integer> supplier = () -> new Random().nextInt();
		System.out.println("Your Lucky Number: " + supplier.get());

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();

		System.out.println("Current System Time : " + time);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		String time2 = s1.get();
		System.out.println("Formatted Current System Time : " + time2);
	}
}
