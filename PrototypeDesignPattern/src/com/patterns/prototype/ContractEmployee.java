package com.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class ContractEmployee extends AbstractEmployee {

	private List<String> tasks = new ArrayList<>();

	public ContractEmployee() {
		tasks.add("Task A");
		tasks.add("Task B");
		tasks.add("Task C");
	}

	public boolean remove(String taskName) {
		return tasks.remove(taskName);
	}

	public boolean add(String taskName) {
		return tasks.add(taskName);
	}

	public void getAllTaskList() {
		tasks.forEach(e -> System.out.println(e));
	}

	@Override
	public AbstractEmployee getCopy() {
		return new ContractEmployee();
	}

}