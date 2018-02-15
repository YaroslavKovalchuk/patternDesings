package com.pattern.decorator;

public class Main {

	public static void main(String[] args) {

		Component component = new ConcreteComponent();
		
		Decorator decorA = new ConcreteDecoratorA();
		
		Decorator decorB = new ConcreteDecoratorB();
		
		decorA.component = component;
		
		decorB.component = decorA;
		
		decorB.operation();
		
		
	}

}
