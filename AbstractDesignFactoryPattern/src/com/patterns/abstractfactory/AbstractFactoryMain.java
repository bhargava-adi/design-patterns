package com.patterns.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String... args) {

		ProductComputer amdComputer = AbstractComputerFactory.getComputer(ComputerType.AMD);
		ProductCPU amdCPU = amdComputer.bringCPU();
		ProductMonitor amdMonitor = amdComputer.bringMonitor();

		System.out.println("\nAMD Computer Specification as follows : ");
		amdCPU.assemble();
		amdMonitor.screenSize();

		ProductComputer intelComputer = AbstractComputerFactory.getComputer(ComputerType.INTEL);
		ProductCPU intelCPU = intelComputer.bringCPU();
		ProductMonitor intelMonitor = intelComputer.bringMonitor();

		System.out.println("\nIntel Computer Specification as follows : ");
		intelCPU.assemble();
		intelMonitor.screenSize();

	}

}

class AbstractComputerFactory {

	private static ProductComputer computer;

	public static ProductComputer getComputer(ComputerType type) {
		switch (type) {
		case AMD:
			computer = new AmdManufacturer();
			break;
		case INTEL:
			computer = new IntelManufacturer();
			break;
		}
		return computer;
	}

}

enum ComputerType {
	AMD, INTEL
}