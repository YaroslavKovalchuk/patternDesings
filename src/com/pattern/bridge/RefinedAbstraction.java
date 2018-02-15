package com.pattern.bridge;

public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor implememtor) {
		super(implememtor);
	}
	
	@Override
	public void operation() {
		super.operation();
	}

}
