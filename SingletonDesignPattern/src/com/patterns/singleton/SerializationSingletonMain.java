package com.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSingletonMain {

	public static void main(String... args) throws Exception {

		SerializationBreakingSingleton breakingInstanceOne = SerializationBreakingSingleton.getInstance();
		SerializationBreakingSingleton breakingInstanceTwo = null;

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(breakingInstanceOne);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		breakingInstanceTwo = (SerializationBreakingSingleton) in.readObject();
		in.close();

		System.out.println("hashCode of breakingInstanceOne is - " + breakingInstanceOne.hashCode());
		System.out.println("hashCode of breakingInstanceOne is - " + breakingInstanceTwo.hashCode());

		SerializationPreventingSingleton preventingInstanceOne = SerializationPreventingSingleton.getInstance();
		SerializationPreventingSingleton preventingInstanceTwo = null;

		ObjectOutput out1 = new ObjectOutputStream(new FileOutputStream("file.text"));
		out1.writeObject(preventingInstanceOne);
		out1.close();

		ObjectInput in1 = new ObjectInputStream(new FileInputStream("file.text"));
		preventingInstanceTwo = (SerializationPreventingSingleton) in1.readObject();
		in1.close();

		System.out.println("Hashcode of preventingInstanceOne - " + preventingInstanceOne.hashCode());
		System.out.println("Hashcode of preventingInstanceTwo - " + preventingInstanceTwo.hashCode());

	}
}

class SerializationBreakingSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static SerializationBreakingSingleton instance = null;

	private SerializationBreakingSingleton() {

	}

	public static SerializationBreakingSingleton getInstance() {
		if (instance == null) {
			synchronized (SerializationBreakingSingleton.class) {
				if (instance == null) {
					instance = new SerializationBreakingSingleton();
				}
			}
		}
		return instance;
	}
}

class SerializationPreventingSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static SerializationPreventingSingleton instance = null;

	private SerializationPreventingSingleton() throws Exception {
	}

	public static SerializationPreventingSingleton getInstance() throws Exception {
		if (instance == null) {
			synchronized (SerializationPreventingSingleton.class) {
				if (instance == null) {
					instance = new SerializationPreventingSingleton();
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}