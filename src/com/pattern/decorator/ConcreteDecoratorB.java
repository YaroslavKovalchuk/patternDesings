package com.pattern.decorator;

public class ConcreteDecoratorB extends Decorator{

	public void addedBehavior() {
		System.out.println("Behavior");
	}
	
	public void operation() {
		
		super.operation();
		 addedBehavior();
		
	}
	
}
