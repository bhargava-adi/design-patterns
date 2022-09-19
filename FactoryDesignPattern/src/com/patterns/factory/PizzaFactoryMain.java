package com.patterns.factory;

public class PizzaFactoryMain {

	public static void main(String... args) {

		System.out.println("\nOrdering the VEG PIZZA");
		Pizza vegPizza = PizzaFactory.orderPizza(PizzaEnum.VEGPIZZA);
		vegPizza.deliver();

		System.out.println("\nOrdering the CALM PIZZA");
		Pizza calmPizza = PizzaFactory.orderPizza(PizzaEnum.CALMPIZZA);
		calmPizza.deliver();

		System.out.println("\nOrdering the CHEESE PIZZA");
		Pizza chessePizza = PizzaFactory.orderPizza(PizzaEnum.CHEESEPIZZA);
		chessePizza.deliver();

		System.out.println("\nOrdering the PEPPERONI PIZZA");
		Pizza pepperoniPizza = PizzaFactory.orderPizza(PizzaEnum.PEPPERONIPIZZA);
		pepperoniPizza.deliver();
	}

}

class PizzaFactory {

	private static Pizza pizza = null;

	public static Pizza orderPizza(PizzaEnum iPizza) {

		if (iPizza == PizzaEnum.VEGPIZZA) {
			pizza = new VegPizza();
		} else if (iPizza == PizzaEnum.CALMPIZZA) {
			pizza = new CalmPizza();
		} else if (iPizza == PizzaEnum.CHEESEPIZZA) {
			pizza = new CheesePizza();
		} else if (iPizza == PizzaEnum.PEPPERONIPIZZA) {
			pizza = new PepperoniPizza();
		}

		return pizza;
	}

}

enum PizzaEnum {
	CALMPIZZA, VEGPIZZA, CHEESEPIZZA, PEPPERONIPIZZA
}