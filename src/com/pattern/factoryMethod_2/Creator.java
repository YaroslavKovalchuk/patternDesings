package com.pattern.factoryMethod_2;

public abstract class Creator {
	
	Product product;
	
	public abstract Product factoryMethod();
	
	public void anOperation() {
		product = factoryMethod();
	}

}
