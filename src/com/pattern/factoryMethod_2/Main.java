package com.pattern.factoryMethod_2;

public class Main {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.factoryMethod();
		
		creator.anOperation();
	} 
}
