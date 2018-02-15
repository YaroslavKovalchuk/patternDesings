package com.pattern.mediator;

public class Main {
	
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleagueOne colleagueOne = new ConcreteColleagueOne(mediator);
		ConcreteColleagueTwo colleagueTwo = new ConcreteColleagueTwo(mediator);
		
		mediator.setColleagueOne(colleagueOne);
		mediator.setColleagueTwo(colleagueTwo);
		
		colleagueOne.send("Message One");
		colleagueTwo.send("Message Two");
		
	}

}
