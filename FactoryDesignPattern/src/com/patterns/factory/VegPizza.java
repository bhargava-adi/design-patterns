package com.patterns.factory;

public class VegPizza implements Pizza {

	public void base() {
		System.out.println("Making the veg pizza.");
	}

	@Override
	public void prepare() {
		System.out.println("Adding toppings on veg pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Baking the veg pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the veg pizza.");
	}

	@Override
	public void box() {
		System.out.println("Wrapping the veg pizza.");
	}

	@Override
	public void deliver() {
		base();
		prepare();
		bake();
		cut();
		box();
		System.out.println("Delievering the veg pizza.");
	}

}