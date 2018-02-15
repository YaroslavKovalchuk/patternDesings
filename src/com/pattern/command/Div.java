package com.pattern.command;

public class Div extends Command{
	
	public Div (ArihmeticUnit unit, int operand) {
		
		this.unit= unit;
		this.operand = operand;

	}
	
	@Override
	public void execute() {
		
		unit.run('/', operand);
		
	}

	@Override
	public void unExecute() {
	
		unit.run('*', operand);
		
	}

}
