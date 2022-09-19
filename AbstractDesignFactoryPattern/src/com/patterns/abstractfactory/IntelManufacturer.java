package com.patterns.abstractfactory;

public class IntelManufacturer implements ProductComputer {

	@Override
	public ProductCPU bringCPU() {
		return new IntelCPU();
	}

	@Override
	public ProductMonitor bringMonitor() {
		return new IntelMonitor();
	}

}