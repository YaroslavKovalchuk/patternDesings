package com.pattern.state;

public class Context {
	
	public State state;
	
	public Context(State state) {
		this.state = state;
	}
	
	public void request() {
		this.state.hander(this);
	}

}
