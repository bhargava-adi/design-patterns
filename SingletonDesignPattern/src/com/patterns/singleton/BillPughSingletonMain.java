package com.patterns.singleton;

public class BillPughSingletonMain {

	public static void main(String... args) {

		BillPughSingleton instanceOne = BillPughSingleton.getInstance();
		BillPughSingleton instanceTwo = BillPughSingleton.getInstance();

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();
	}
}

class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class BillPughInnerClass {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return BillPughInnerClass.instance;
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}
