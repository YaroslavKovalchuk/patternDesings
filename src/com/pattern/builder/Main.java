package com.pattern.builder;

public class Main {
	public static void main(String[] args) {
		
			Builder builder = new ConcreteBuilder();
			Foreman foreman = new Foreman(builder);
			
			foreman.construct();
			
			House house = builder.getResult();
			
	}
}
