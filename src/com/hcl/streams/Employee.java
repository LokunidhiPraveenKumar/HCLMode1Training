package com.hcl.streams;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d\t%s\t%.2f", this.id, this.name, this.salary);
	}

}