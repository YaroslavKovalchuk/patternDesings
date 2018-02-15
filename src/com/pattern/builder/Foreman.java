package com.pattern.builder;

public class Foreman {
	
	Builder builder;
	
	Foreman(Builder builder){
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildBasement();
		builder.buildStorey();
		builder.buildRoof();
	}
	
	
	
}
