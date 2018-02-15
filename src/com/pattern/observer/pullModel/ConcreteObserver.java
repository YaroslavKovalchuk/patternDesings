package com.pattern.observer.pullModel;

public class ConcreteObserver extends Observer{

	private String name;
	private String observeState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		
		observeState = subject.getSubjectState();
		
	}

}
