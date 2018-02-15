package com.pattern.command;

public class Calculator {
	
	ArihmeticUnit arihmeticUnit;
	ControlUnit controlUnit;
	
	public Calculator() {
		arihmeticUnit = new ArihmeticUnit();
		controlUnit = new ControlUnit();
	}
	
	private int run(Command command) {
		controlUnit.storeCommand(command);
		controlUnit.executeCommand();
		return arihmeticUnit.register;
	}
	
	
	public int add(int operand) {
		return run(new Add(arihmeticUnit,operand));
		}
	
	public int div(int operand) {
		return run(new Div(arihmeticUnit,operand));
		}
	
	public int mul(int operand) {
		return run(new Mul(arihmeticUnit,operand));
	}
	public int sub(int operand) {
		return run(new Sub(arihmeticUnit,operand));
	}	
	public int redo(int levels) {
		controlUnit.Redo(levels);
		return arihmeticUnit.register;
	}
	public int undo(int levels) {
	controlUnit.undo(levels);
	return arihmeticUnit.register;
	}
}
