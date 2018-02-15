package com.pattern.chainOfResponsibility;

public abstract class Handler {
	
	protected Handler succesor;
	
	public abstract void handleRequest(int request);
	
	public void setSuccesor(Handler succesor) {
		
		this.succesor = succesor;
		
	}

	public Handler getSuccesor() {
		return succesor;
	}
	
	

}
