package com.pattern.iterator;

public abstract class Iterator {
	
	public abstract Object currentItem();
	
	public abstract Object first();
	
	public abstract boolean isDone();
	
	public abstract Object next();

}
