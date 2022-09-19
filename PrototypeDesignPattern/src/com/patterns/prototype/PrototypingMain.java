package com.patterns.prototype;

public class PrototypingMain {

	public static void main(String... args) {

		PermanentEmployee pEmployee1 = new PermanentEmployee();
		PermanentEmployee pEmployee2 = (PermanentEmployee) pEmployee1.getCopy();

		pEmployee2.remove("Task 3");
		pEmployee2.add("Task 4");
		pEmployee1.add("Task 5");

		System.out.println("Permanent Employee 1 Tasks : ");
		pEmployee1.getAllTaskList();
		System.out.println("Permanent Employee 2 Tasks : ");
		pEmployee2.getAllTaskList();

		ContractEmployee cEmployee1 = new ContractEmployee();
		ContractEmployee cEmployee2 = (ContractEmployee) cEmployee1.getCopy();

		cEmployee2.remove("Task C");
		cEmployee2.add("Task D");
		cEmployee1.add("Task Z");

		System.out.println("Contract Employee 1 Tasks : ");
		cEmployee1.getAllTaskList();
		System.out.println("Contract Employee 1 Tasks : ");
		cEmployee2.getAllTaskList();

	}
}