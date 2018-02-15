package com.pattern.command;

public abstract class Command {
	
	protected int operand;
	
	protected ArihmeticUnit unit;
	
	public abstract void execute();
	
	public abstract void unExecute();

}
