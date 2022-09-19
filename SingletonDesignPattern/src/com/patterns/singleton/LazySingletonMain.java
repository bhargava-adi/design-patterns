package com.patterns.singleton;

public class LazySingletonMain {

	public static void main(String... args) {

		LazySingleton instanceOne = LazySingleton.getInstance();
		LazySingleton instanceTwo = LazySingleton.getInstance();

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();
	}
}

class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}