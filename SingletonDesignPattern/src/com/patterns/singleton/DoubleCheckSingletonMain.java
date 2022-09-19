package com.patterns.singleton;

public class DoubleCheckSingletonMain {

	public static void main(String... args) {

		DoubleCheckSingleton instanceOne = DoubleCheckSingleton.getInstance();
		DoubleCheckSingleton instanceTwo = DoubleCheckSingleton.getInstance();

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();

	}

}

class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {

	}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}