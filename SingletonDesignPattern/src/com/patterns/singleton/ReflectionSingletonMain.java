package com.patterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonMain {

	public static void main(String... args) throws Exception {

		ReflectionBreakingSingleton breakingInstanceOne = ReflectionBreakingSingleton.getInstance();
		ReflectionBreakingSingleton breakingInstanceTwo = null;

		try {
			Constructor<ReflectionBreakingSingleton> constructor = ReflectionBreakingSingleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			breakingInstanceTwo = (ReflectionBreakingSingleton) constructor.newInstance();

			System.out.println("Hashcode of breakingInstanceOne - " + breakingInstanceOne.hashCode());
			System.out.println("Hashcode of breakingInstanceTwo - " + breakingInstanceTwo.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		ReflectionPreventingSingleton preventingInstanceOne = ReflectionPreventingSingleton.getInstance();
		ReflectionPreventingSingleton preventingInstanceTwo = null;

		try {
			System.out.println("Hashcode of preventingInstanceOne - " + preventingInstanceOne.hashCode());
			
			Constructor<ReflectionPreventingSingleton> constructor = ReflectionPreventingSingleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			preventingInstanceTwo = (ReflectionPreventingSingleton) constructor.newInstance();

			
			System.out.println("Hashcode of preventingInstanceTwo - " + preventingInstanceTwo.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class ReflectionBreakingSingleton {

	private static ReflectionBreakingSingleton instance = null;

	private ReflectionBreakingSingleton() {

	}

	public static ReflectionBreakingSingleton getInstance() {
		if (instance == null) {
			synchronized (ReflectionBreakingSingleton.class) {
				if (instance == null) {
					instance = new ReflectionBreakingSingleton();
				}
			}
		}
		return instance;
	}
}

class ReflectionPreventingSingleton {

	private static ReflectionPreventingSingleton instance = null;

	private ReflectionPreventingSingleton() throws Exception {
		if (instance != null) {
			throw new RuntimeException("Instance already exists");
		}
	}

	public static ReflectionPreventingSingleton getInstance() throws Exception {
		if (instance == null) {
			synchronized (ReflectionPreventingSingleton.class) {
				if (instance == null) {
					instance = new ReflectionPreventingSingleton();
				}
			}
		}
		return instance;
	}
}