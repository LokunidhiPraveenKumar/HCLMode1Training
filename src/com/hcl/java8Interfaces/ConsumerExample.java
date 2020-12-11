package com.hcl.java8Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String... args) {

		List<String> cities = Arrays.asList("Chennai", "Nodia", "Visakhapatanam", "Bangalore");

		Consumer<List<String>> upperCaseConsumer = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i).toUpperCase());
			}
		};
		
		Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);
		
		upperCaseConsumer.andThen(printConsumer).accept(cities);
	}
}