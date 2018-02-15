package com.pattern.command;

public class ArihmeticUnit {
	
	public int register = 0;
	
	public void run(char operationCode, int operand) {
		
		switch(operationCode) {
		
		case '+': register += operand;
		break;
		
		case '-': register -= operand;
		break;
		
		case '*': register *= operand;
		break;
		
		case '/': register /= operand;
		break;
		
		}
	}

}
