package com.pattern.state;

public class ConcreteStateA extends State{
	
	public ConcreteStateA() {
		System.out.println("ConcreteStateA");
	}

	@Override
	public void hander(Context context) {
		
		context.state = new ConctereStateB();
		
	}

}
