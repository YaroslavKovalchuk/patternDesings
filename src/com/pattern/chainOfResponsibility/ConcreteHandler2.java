package com.pattern.chainOfResponsibility;

public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		
		if(request == 2) {
			System.out.println("TWO");
		}else if(succesor!=null) {
			succesor.handleRequest(request);
		}
	}

}
