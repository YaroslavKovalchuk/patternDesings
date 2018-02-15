package com.pattern.interpreter;

public class Main {
	
	public static void main(String[] args) {
		
		Context context = new Context();
				context.vocabulary = 'a';
				context.source = "aaa";
				
				AbstractExpression expression = new NoterminalExpression();
				
				expression.interpret(context);
				
				System.out.println(context.result);
	
	}

}
