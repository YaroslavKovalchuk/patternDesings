package com.pattern.mediator;

public class ConcreteColleagueOne extends Colleague{

	public ConcreteColleagueOne(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(message);
	}

}
