package com.pattern.builder;

public class ConcreteBuilder extends Builder {
	
	 House house = new House();;

	@Override
	public void buildBasement() {
		
		house.add(new Basement());
	}

	@Override
	public void buildRoof() {
		
		house.add(new Roof());
	}

	@Override
	public void buildStorey() {
		
		house.add(new Storey());
	}

	@Override
	public House getResult() {
		
		return house;
	}
	
	
	
}
