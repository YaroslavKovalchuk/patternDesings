package com.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		Abstraction abstraction;
		
		abstraction = new RefinedAbstraction(new ConcreteImplementorA());
		abstraction.operation();
		
		abstraction = new RefinedAbstraction(new ConcreteImplementorB());
		abstraction.operation();

	}

}
