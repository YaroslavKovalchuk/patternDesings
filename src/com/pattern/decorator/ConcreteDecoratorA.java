package com.pattern.decorator;

public class ConcreteDecoratorA extends Decorator{

	public String addedState = "Some state";
	
	public void operation() {
		
		super.operation();
		System.out.println(addedState);
		
	}
	
}
