package com.patterns.singleton;

public class StaticSingletonMain {

	public static void main(String... args) {

		StaticSingleton instanceOne = StaticSingleton.instance;
		StaticSingleton instanceTwo = StaticSingleton.instance;

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();
	}

}

class StaticSingleton {

	public static StaticSingleton instance;

	private StaticSingleton() {

	}

	static {
		instance = new StaticSingleton();
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}