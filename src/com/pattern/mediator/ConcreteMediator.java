package com.pattern.mediator;

public class ConcreteMediator extends Mediator{
	
	private ConcreteColleagueOne colleagueOne;
	private ConcreteColleagueTwo colleagueTwo;

	public ConcreteColleagueOne getColleagueOne() {
		return colleagueOne;
	}

	public void setColleagueOne(ConcreteColleagueOne colleagueOne) {
		this.colleagueOne = colleagueOne;
	}

	public ConcreteColleagueTwo getColleagueTwo() {
		return colleagueTwo;
	}

	public void setColleagueTwo(ConcreteColleagueTwo colleagueTwo) {
		this.colleagueTwo = colleagueTwo;
	}

	@Override
	public void send(String message, Colleague colleague) {
	
		if(colleague.equals(getColleagueOne()) ) {
			((ConcreteColleagueOne) colleague).notify(message);
		}else if(colleague.equals(getColleagueTwo())) {
			((ConcreteColleagueTwo) colleague).notify(message);
		}
		
	}

}
