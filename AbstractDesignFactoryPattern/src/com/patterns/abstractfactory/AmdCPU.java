package com.patterns.abstractfactory;

public class AmdCPU implements ProductCPU {

	@Override
	public void assemble() {
		System.out.println("Assmebling in AMD CPU.");
	}

}