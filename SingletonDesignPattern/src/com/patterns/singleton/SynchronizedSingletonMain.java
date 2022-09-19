package com.patterns.singleton;

public class SynchronizedSingletonMain {

	public static void main(String... args) {

		SynchronizedSingleton instanceOne = SynchronizedSingleton.getInstance();
		SynchronizedSingleton instanceTwo = SynchronizedSingleton.getInstance();

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();
	}
}

class SynchronizedSingleton {

	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {

	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		return instance;
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}