package com.patterns.singleton;

public class EagerSingletonMain {

	public static void main(String... args) {

		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo = EagerSingleton.getInstance();

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();
	}
}

class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return instance;
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}