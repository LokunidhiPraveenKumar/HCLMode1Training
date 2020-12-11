package com.hcl.java8Interfaces;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExample {
	public static void main(String... args) {
		/*
		 * Function<String, Integer> function = new Function<String, Integer>() {
		 * 
		 * @Override public Integer apply(String s) { return s.length();// Gets the
		 * length of each string and returns } };
		 */

		Function<String, Integer> function = st -> {
			return st.length();
		};

		Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
		System.out.println("Lengths of each strings:");
		Stream<Integer> stream1 = stream.map(function);
		stream1.forEach(System.out::println);
	}
}