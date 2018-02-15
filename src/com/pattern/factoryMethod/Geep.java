package com.pattern.factoryMethod;

public class Geep implements Car {
	@Override
	public void drive() {
		System.out.println("Geep DRIVE");
		
	}
	@Override
	public void stop() {
		System.out.println("Geep STOP");
		
	}
}
