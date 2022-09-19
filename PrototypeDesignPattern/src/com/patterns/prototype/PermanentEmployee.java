package com.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PermanentEmployee extends AbstractEmployee {

	private List<String> tasks = new ArrayList<>();

	public PermanentEmployee() {
		tasks.add("Task 1");
		tasks.add("Task 2");
		tasks.add("Task 3");
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
		return new PermanentEmployee();
	}
}