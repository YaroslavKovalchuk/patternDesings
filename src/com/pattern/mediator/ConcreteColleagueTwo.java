package com.pattern.mediator;

public class ConcreteColleagueTwo extends Colleague{
	
	public ConcreteColleagueTwo(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(message);
	}


}
