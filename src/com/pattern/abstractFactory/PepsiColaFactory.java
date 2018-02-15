package com.pattern.abstractFactory;

public class PepsiColaFactory extends AbstractFactory{
	
	@Override
	public  AbstractWater createWater() {
		return new PepsiColaWater();
	}
	@Override
	public  AbstractBottle createBottle() {
		
		return new PepsiColaBottle();
	}
	
}
