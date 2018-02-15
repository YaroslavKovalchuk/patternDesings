package com.pattern.command;

public class Mul extends Command{
	
	public Mul(ArihmeticUnit unit, int operand) {
		
		this.unit= unit;
		this.operand = operand;
		
	}

	@Override
	public void  execute() {
		unit.run('*', operand);
	}

	@Override
	public void unExecute() {
		unit.run('/', operand);
	}

}
