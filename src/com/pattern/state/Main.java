package com.pattern.state;

public class Main {

	public static void main(String[] args) {
		
		Context context = new Context(new ConcreteStateA());
	context.request();
	context.request();

	}

}
