package com.hcl.java8Interfaces;

import java.util.Optional;

public class OptionalExample {
	public static void main(String... args) {
		Optional<String> gender = Optional.of("MALE");
		String answer1 = "Yes";
		String answer2 = null;

		System.out.println("Non-Empty Optional:" + gender);
		System.out.println("Non-Empty Optional: Gender value : " + gender.get());
		System.out.println("Empty Optional: " + Optional.empty());

		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

		// java.lang.NullPointerException
		// System.out.println("ofNullable on Non-Empty Optional: " +
		// Optional.of(answer2));

		Optional<String> emptyGender = Optional.empty();

		// Filter on Optional
		System.out.println(gender.filter(g -> g.equals("male"))); // Optional.empty
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("male"))); // Optional[MALE]
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional.empty

	}
}