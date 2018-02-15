package com.pattern.chainOfResponsibility;

public class ConcreteHandler1 extends Handler{

	
	@Override
	public void handleRequest(int request) {
		
		if(request == 1) {
			System.out.println("ONE");
		}else if(succesor!=null) {
			succesor.handleRequest(request);
		}
		
	}

}
