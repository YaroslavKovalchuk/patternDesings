package com.pattern.iterator;

public abstract class Aggregate {
	
	public abstract int getCount();
	
	public abstract Iterator createIterator();
	
	public abstract Object getObject(int index);
	
	public abstract void setObject(Object object);

}
