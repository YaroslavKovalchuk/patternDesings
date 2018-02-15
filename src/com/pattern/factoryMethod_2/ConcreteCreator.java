package com.pattern.factoryMethod_2;

public class ConcreteCreator extends Creator{
	
	public Product factoryMethod() {
		
		Product product =  new ConcreteProduct();
		
		return product;
	}
}
