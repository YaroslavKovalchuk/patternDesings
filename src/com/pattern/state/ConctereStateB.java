package com.pattern.state;

public class ConctereStateB extends State {
	
	public ConctereStateB() {
		System.out.println("ConcreteStateB");
	}

	@Override
	public void hander(Context context) {
		
		context.state = new ConcreteStateA();

	}

}
