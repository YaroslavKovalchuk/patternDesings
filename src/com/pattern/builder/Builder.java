 package com.pattern.builder;

public abstract class Builder {
	
	public abstract void buildBasement();
	public abstract void buildRoof();
	public abstract void buildStorey();
	public abstract House getResult();
	
}
