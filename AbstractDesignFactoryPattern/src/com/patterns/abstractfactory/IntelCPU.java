package com.patterns.abstractfactory;

public class IntelCPU implements ProductCPU {

	@Override
	public void assemble() {
		System.out.println("Assmebling in INTEL CPU.");
	}

}