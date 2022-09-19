package com.patterns.singleton;

public class CloningSingletonMain {

	public static void main(String... args) throws Exception {

		CloningBreakingSingleton breakingInstanceOne = CloningBreakingSingleton.getInstance();
		CloningBreakingSingleton breakingInstanceTwo = (CloningBreakingSingleton) breakingInstanceOne.clone();

		System.out.println("HashCode of Instance One : " + breakingInstanceOne.hashCode());
		breakingInstanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + breakingInstanceTwo.hashCode());
		breakingInstanceTwo.doOtherStuff();

		CloningPreventingSingleton preventingInstanceOne = CloningPreventingSingleton.getInstance();
		CloningPreventingSingleton preventingInstanceTwo = (CloningPreventingSingleton) preventingInstanceOne.clone();

		System.out.println("HashCode of Instance One : " + preventingInstanceOne.hashCode());
		preventingInstanceOne.doOtherStuff();
		System.out.println("HashCode of Instance Two : " + preventingInstanceTwo.hashCode());
		preventingInstanceTwo.doOtherStuff();

	}
}

class CloningBreakingSingleton implements Cloneable {

	private static CloningBreakingSingleton instance = null;

	private CloningBreakingSingleton() {

	}

	public static CloningBreakingSingleton getInstance() {
		if (instance == null) {
			synchronized (CloningBreakingSingleton.class) {
				if (instance == null) {
					instance = new CloningBreakingSingleton();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}
}

class CloningPreventingSingleton implements Cloneable {

	private static CloningPreventingSingleton instance = null;

	private CloningPreventingSingleton() {

	}

	public static CloningPreventingSingleton getInstance() throws Exception {
		if (instance == null) {
			synchronized (CloningPreventingSingleton.class) {
				if (instance == null) {
					instance = new CloningPreventingSingleton();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException();
		return instance;
	}

	public void doOtherStuff() {
		System.out.println("Doing other stuff");
	}
}