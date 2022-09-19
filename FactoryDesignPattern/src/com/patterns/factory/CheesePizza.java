package com.patterns.factory;

public class CheesePizza implements Pizza {

	public void base() {
		System.out.println("Making the cheese pizza.");
	}

	@Override
	public void prepare() {
		System.out.println("Adding toppings on cheese pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Baking the cheese pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the cheese pizza.");
	}

	@Override
	public void box() {
		System.out.println("Wrapping the cheese pizza.");
	}

	@Override
	public void deliver() {
		base();
		prepare();
		bake();
		cut();
		box();
		System.out.println("Delievering the cheese pizza.");
	}

}