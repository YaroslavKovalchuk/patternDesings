package com.pattern.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		Car car = CarSelector.getInstance().getCar(RoadType.CITY);
		car.stop();
		car.drive();
		car = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
		car.stop();
		car.drive();
		car = CarSelector.getInstance().getCar(RoadType.TREACK);
		car.stop();
		car.drive();
		
		

	}

}
