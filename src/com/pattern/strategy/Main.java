package com.pattern.strategy;

public class Main {

	public static void main(String[] args) {
	
		Context context;
		
		context = new Context(new ConcretaStrategyA());
		context.contextInterface();
		
		
		context = new Context(new ConcretaStrategyB());
		context.contextInterface();
	}

}
