package com.pattern.interpreter;

public class TerminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		context.result = context.source.charAt(context.position) == context.vocabulary; 
		
	}

}
