package com.pattern.bridge;

public abstract class Abstraction {

	protected Implementor implememtor;
	
	public Abstraction(Implementor implememtor) {
		this.implememtor = implememtor;
	}
	
	public void operation() {
		implememtor.operetionImp();
	}
	
}
