package com.patterns.factory;

public class CalmPizza implements Pizza {

	public void base() {
		System.out.println("Making the calm pizza.");
	}

	@Override
	public void prepare() {
		System.out.println("Adding toppings on calm pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Baking the calm pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the calm pizza.");
	}

	@Override
	public void box() {
		System.out.println("Wrapping the calm pizza.");
	}

	@Override
	public void deliver() {
		base();
		prepare();
		bake();
		cut();
		box();
		System.out.println("Delievering the calm pizza.");
	}

}