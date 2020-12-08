package com.hcl.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Mayank", 100000.0));
		empList.add(new Employee(2, "Praveen", 300000.0));
		empList.add(new Employee(3, "Zaynab", 208000.0));
		empList.add(new Employee(4, "Nisha", 800000.0));
		empList.add(new Employee(5, "Arun", 550000.0));

		empList.stream().forEach(e -> System.out.println(e.name));

		System.out.println("Displaying Employee's names whose salary > 150000");
		empList.stream().filter(e -> e.salary > 150000).forEach(e -> System.out.println(e.id + " " + e.name));

		System.out.println("Displaying all Employee's Id :");
		empList.stream().map(e -> e.id).forEach(System.out::println);

		List<Employee> employees = empList.stream().filter(e -> e.salary > 100000).collect(Collectors.toList());
		System.out.println("List of employees having salaries greater than 100000");
		for (Employee e : employees)
			System.out.println(e);

		// updating the salaries of emp except emp with id == 2
		List<String> empNames = empList.stream().filter(e -> e.id != 2).peek(e -> e.salary += 5000).map(e -> e.name)
				.collect(Collectors.toList());
		System.out.println(empNames);

		Long empCount = empList.stream().filter(e -> e.salary > 200000).count();
		System.out.println("No : of Employees whose salary > 200000: " + empCount);

		List<String> employeeSorted = empList.stream().sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
				.map(e -> e.name).collect(Collectors.toList());
		System.out.println(employeeSorted);

		Double sumSal = empList.stream().map(e -> e.salary).reduce(0.0, (sum, salary) -> sum + salary);
		System.out.println("Total Salaries of all employee's :" + sumSal);

		String employee = empList.stream().filter(e -> e.salary > 100000).map(e -> e.name).findFirst().orElse(null);
		System.out.println("First Employee in stream " + employee + " have salary > 100000");

		Object[] employeeNames = empList.stream().filter(e -> e.name.startsWith("V")).map(e -> e.name).toArray();
		System.out.println(Arrays.toString(employeeNames));

		List<List<String>> namesNested = Arrays.asList(Arrays.asList("Jeff", "Bezos"), Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));

		List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(namesFlatStream);

		Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

		List<Integer> collect = infiniteStream.skip(3).limit(5).collect(Collectors.toList());
		System.out.println(collect);

		Employee highestSalaryEmployee = empList.stream().max((p1, p2) -> Double.compare(p1.salary, p2.salary)).get();
		System.out.println("Highest Salary paid Employee Name : " + highestSalaryEmployee.name + " Salary : "
				+ highestSalaryEmployee.salary);
		Employee lowestSalaryEmployee = empList.stream().min((p1, p2) -> Double.compare(p1.salary, p2.salary)).get();
		System.out.println("Lowest Salary paid Employee Name : " + lowestSalaryEmployee.name + " Salary : "
				+ lowestSalaryEmployee.salary);

		double totalSalaries = empList.stream().mapToDouble(e -> e.salary).sum();
		System.out.println("Total salaries : " + totalSalaries);

		List<String> distinctEmployeeList = empList.stream().map(e -> e.name).distinct().collect(Collectors.toList());
		System.out.println("Distinct Emp List : " + distinctEmployeeList);

		double averageSalaries = empList.stream().mapToDouble(e -> e.salary).average().getAsDouble();
		System.out.println("Average of all Salaries : " + averageSalaries);

		List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8, 10, 13, 14, 18, 21);

		boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
		boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
		boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);

		System.out.println(allEven + " " + oneEven + " " + noneMultipleOfThree);// false true false
	}
}