package com.pattern.memento;

public class Main {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		originator.setState("ON");
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		
		originator.setState("OFF");
		originator.setMemento(caretaker.getMemento());
	}
	
}
