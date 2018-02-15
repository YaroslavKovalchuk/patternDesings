package com.pattern.abstractFactory;

public class CocaColaFactory extends AbstractFactory{
	
	@Override
	public  AbstractWater createWater() {
		
		return new CocaColaWater();
	}
	@Override
	public  AbstractBottle createBottle() {
		
		return new CocaColaBattle();
	}

}
