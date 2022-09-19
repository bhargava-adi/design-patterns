package com.patterns.abstractfactory;

public class IntelMonitor implements ProductMonitor {

	@Override
	public void screenSize() {
		System.out.println("INTEL Monitor is of 18inch.");
	}

}