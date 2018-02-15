package com.pattern.interpreter;

public class NoterminalExpression extends AbstractExpression{

	AbstractExpression noterminalExpression;
	AbstractExpression terminalExpression;
	
	@Override
	public void interpret(Context context) {
		
		if(context.position < context.source.length()) {
			
			terminalExpression = new TerminalExpression();
			terminalExpression.interpret(context);
			context.position++;
			
			if(context.result) {
				
				noterminalExpression = new NoterminalExpression();
				noterminalExpression.interpret(context);
			
			}
			
		}
		
	}

}
