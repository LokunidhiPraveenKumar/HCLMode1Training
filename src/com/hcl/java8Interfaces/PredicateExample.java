package com.hcl.java8Interfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {
	public static void main(String... args) {
		Predicate<String> predicate = (st) -> st.length() > 5;

		System.out.println(predicate.test("Praveen"));
		System.out.println(predicate.test("Kumar"));

		Predicate<Integer> pred = new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				if (integer > 5) {
					return true;
				}
				return false;
			}
		};

		Stream<Integer> stream = Stream.of(1, 23, 3, 4, 5, 56, 6, 6);
		List<Integer> list = stream.filter(pred).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}