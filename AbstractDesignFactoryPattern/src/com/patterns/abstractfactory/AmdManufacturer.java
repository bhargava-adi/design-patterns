package com.patterns.abstractfactory;

public class AmdManufacturer implements ProductComputer {

	@Override
	public ProductCPU bringCPU() {
		return new AmdCPU();
	}

	@Override
	public ProductMonitor bringMonitor() {
		return new AmdMonitor();
	}

}