package com.patterns.singleton;

public class DoubleCheckBillPughSingletonMain {

	public static void main(String... args) {
		
		DoubleCheckBillPughSingleton instanceOne = DoubleCheckBillPughSingleton.getInstance();
		DoubleCheckBillPughSingleton instanceTwo = DoubleCheckBillPughSingleton.getInstance();

		System.out.println("HashCode of Instance One : " + instanceOne.hashCode());
		instanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + instanceTwo.hashCode());
		instanceTwo.doOtherStuff();

	}
}

class DoubleCheckBillPughSingleton {

	private DoubleCheckBillPughSingleton() {

	}

	private static class DoubleCheckedBillPughInnerClass {

		private static DoubleCheckBillPughSingleton instance;

		private static synchronized DoubleCheckBillPughSingleton getInstance() {
			if (instance == null) {
				instance = new DoubleCheckBillPughSingleton();
			}
			return instance;
		}
	}

	public static DoubleCheckBillPughSingleton getInstance() {
		return DoubleCheckedBillPughInnerClass.getInstance();
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}

}