package com.pattern.observer.pullModel;

public class Main {

	public static void main(String[] args) {
		
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject));
		subject.attach(new ConcreteObserver(subject));
		subject.setSubjectState("Some state");
		

	}

}
