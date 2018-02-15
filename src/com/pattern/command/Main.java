package com.pattern.command;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		int result = 0;
		
		result = calculator.add(5);
		System.out.println(result);
		
		result = calculator.add(5);
		System.out.println(result);
		
		result = calculator.sub(3);
		System.out.println(result);
		
		result = calculator.undo(2);
		System.out.println(result);
		
		result = calculator.redo(1);
		System.out.println(result);
		
	}

}
