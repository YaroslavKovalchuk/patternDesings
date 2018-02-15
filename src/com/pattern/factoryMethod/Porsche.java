package com.pattern.factoryMethod;

public class Porsche implements Car {
	@Override
	public void drive() {
		System.out.println("Porsche DRIVE");
		
	}
	@Override
	public void stop() {
		System.out.println("Porsche STOP");
		
	}
}
