package com.patterns.factory;

public class PepperoniPizza implements Pizza {

	public void base() {
		System.out.println("Making the pepperoni pizza.");
	}

	@Override
	public void prepare() {
		System.out.println("Adding toppings on pepperoni pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Baking the pepperoni pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pepperoni pizza.");
	}

	@Override
	public void box() {
		System.out.println("Wrapping the pepperoni pizza.");
	}

	@Override
	public void deliver() {
		base();
		prepare();
		bake();
		cut();
		box();
		System.out.println("Delievering the pepperoni pizza.");
	}

}