package com.pattern.abstractFactory;

public class Client {

	private AbstractBottle bottle;
	
	private AbstractWater water;
	
	Client(AbstractFactory factory){
		bottle = factory.createBottle();
		water = factory.createWater();
	}
	
	public void run() {
		
	}
	
	
}
