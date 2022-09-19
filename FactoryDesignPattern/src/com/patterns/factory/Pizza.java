package com.patterns.factory;

public interface Pizza {

	public default void base() {
		System.out.println("Preparing base of pizza.");
	}

	public abstract void prepare();

	public abstract void bake();

	public abstract void cut();

	public abstract void box();

	public abstract void deliver();

}