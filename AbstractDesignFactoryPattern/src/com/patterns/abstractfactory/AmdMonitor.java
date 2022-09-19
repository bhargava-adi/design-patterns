package com.patterns.abstractfactory;

public class AmdMonitor implements ProductMonitor {

	@Override
	public void screenSize() {
		System.out.println("AMD Monitor is of 14inch.");
	}

}